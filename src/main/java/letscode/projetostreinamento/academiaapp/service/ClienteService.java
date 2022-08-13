package letscode.projetostreinamento.academiaapp.service;

import letscode.projetostreinamento.academiaapp.models.Cliente;
import letscode.projetostreinamento.academiaapp.models.InfoPessoal;

import java.util.List;

public interface ClienteService {
    Cliente getCliente(InfoPessoal infoPessoal);
    List<Cliente> listAllClientes();
    Cliente addCliente(Cliente cliente);
    void delete(InfoPessoal infoPessoal);
}
