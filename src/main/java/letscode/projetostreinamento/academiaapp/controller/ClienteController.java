package letscode.projetostreinamento.academiaapp.controller;

import letscode.projetostreinamento.academiaapp.models.Cliente;
import letscode.projetostreinamento.academiaapp.models.InfoPessoal;
import letscode.projetostreinamento.academiaapp.service.impl.ClienteServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
    final ClienteServiceImpl clienteService;

    public ClienteController(ClienteServiceImpl clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping
    String teste(){
        return "teste";
    }

    @PostMapping
    void addCliente(@RequestBody Cliente cliente){
        clienteService.addCliente(cliente);
    }

    @GetMapping("/{id}")
    ResponseEntity<Cliente> getCliente(@PathVariable InfoPessoal infoPessoal){
        return ResponseEntity.ok(clienteService.getCliente(infoPessoal));
    }
}
