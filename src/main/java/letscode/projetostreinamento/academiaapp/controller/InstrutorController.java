package letscode.projetostreinamento.academiaapp.controller;

import letscode.projetostreinamento.academiaapp.models.Instrutor;
import letscode.projetostreinamento.academiaapp.service.InstrutorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/instrutor")
public class InstrutorController {
    final InstrutorService instrutorService;

    public InstrutorController(InstrutorService instrutorService) {
        this.instrutorService = instrutorService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Instrutor> getInstrutor(@RequestBody String cpf){
        return ResponseEntity.ok(instrutorService.getInstrutor(cpf));
    }

    @GetMapping
    public ResponseEntity<List<Instrutor>> listAllInstrutor(){
        return ResponseEntity.ok(instrutorService.listAllInstrutor());
    }

    @PostMapping
    public ResponseEntity<Instrutor> addInstrutor(@RequestBody Instrutor instrutor){
        return ResponseEntity.ok(instrutorService.addInstrutor(instrutor));
    }

    @DeleteMapping("/{id}")
    public void delete(@RequestBody String cpf){
        instrutorService.delete(cpf);
    }
}
