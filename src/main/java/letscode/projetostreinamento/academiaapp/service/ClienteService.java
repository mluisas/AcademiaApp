package letscode.projetostreinamento.academiaapp.service;

import letscode.projetostreinamento.academiaapp.models.Cliente;

import java.util.List;

public interface ClienteService {
    Cliente getCliente(String cpf);
    List<Cliente> listAllClientes();
    Cliente addCliente(Cliente cliente);
    void delete(String cpf);
}
