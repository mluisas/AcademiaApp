package letscode.projetostreinamento.academiaapp.controller;

import letscode.projetostreinamento.academiaapp.models.Cliente;
import letscode.projetostreinamento.academiaapp.service.ClienteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
    final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @PostMapping
    public ResponseEntity<Cliente> addCliente(@RequestBody Cliente cliente){
        return ResponseEntity.ok(clienteService.addCliente(cliente));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cliente> getCliente(@PathVariable String cpf){
        return ResponseEntity.ok(clienteService.getCliente(cpf));
    }

    @GetMapping
    public ResponseEntity<List<Cliente>> listAllClientes(){
        return ResponseEntity.ok(clienteService.listAllClientes());
    }
    @DeleteMapping
    public void delete(String cpf){
        clienteService.delete(cpf);
    }
}
