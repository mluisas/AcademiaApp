package service;

import models.Cliente;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteService {
    final ClienteRepository clienteRepository;

    public ClienteServiceImpl(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @Override
    public Cliente getCliente(Integer id) {
        return clienteRepository.findById(id).orElseThrow(RuntimeException::new);
    }

    @Override
    public List<Cliente> listAllClientes() {
        return clienteRepository.findAll();
    }

    @Override
    public void addCliente(Cliente cliente){
        clienteRepository.save(cliente);
    }
}
