package letscode.projetostreinamento.academiaapp.service.impl;

import letscode.projetostreinamento.academiaapp.models.Cliente;
import letscode.projetostreinamento.academiaapp.models.InfoPessoal;
import letscode.projetostreinamento.academiaapp.repository.ClienteRepository;
import letscode.projetostreinamento.academiaapp.service.ClienteService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteService {
    final ClienteRepository clienteRepository;

    public ClienteServiceImpl(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @Override
    public Cliente getCliente(InfoPessoal infoPessoal) {
        return clienteRepository.findById(infoPessoal).orElseThrow(RuntimeException::new);
    }

    @Override
    public List<Cliente> listAllClientes() {
        return clienteRepository.findAll();
    }

    @Override
    public Cliente addCliente(Cliente cliente){
        return clienteRepository.save(cliente);
    }

    @Override
    public void delete(InfoPessoal infoPessoal) {
        clienteRepository.deleteById(infoPessoal);
    }
}
