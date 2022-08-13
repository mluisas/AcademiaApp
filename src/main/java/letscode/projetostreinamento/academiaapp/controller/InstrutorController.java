package letscode.projetostreinamento.academiaapp.controller;

import letscode.projetostreinamento.academiaapp.models.InfoPessoal;
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
    public ResponseEntity<Instrutor> getInstrutor(@RequestBody InfoPessoal infoPessoal){
        return ResponseEntity.ok(instrutorService.getInstrutor(infoPessoal));
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
    public void delete(@RequestBody InfoPessoal infoPessoal){
        instrutorService.delete(infoPessoal);
    }
}
