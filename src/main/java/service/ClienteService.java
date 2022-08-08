package service;

import models.Cliente;

import java.util.List;

interface ClienteService {
    Cliente getCliente(Integer id);
    List<Cliente> listAllClientes();

    void addCliente(Cliente cliente);


}
