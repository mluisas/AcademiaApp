package letscode.projetostreinamento.academiaapp.service.impl;

import letscode.projetostreinamento.academiaapp.models.Cliente;
import letscode.projetostreinamento.academiaapp.repository.ClienteRepository;
import letscode.projetostreinamento.academiaapp.service.ClienteService;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@CacheConfig(cacheNames = {"clientes"})
public class ClienteServiceImpl implements ClienteService {
    final ClienteRepository clienteRepository;

    public ClienteServiceImpl(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @Override
    @Cacheable
    public Cliente getCliente(String cpf) {
        return clienteRepository.findById(cpf).orElseThrow(RuntimeException::new);
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
    @CacheEvict
    public void delete(String cpf) {
        clienteRepository.deleteById(cpf);
    }
}
