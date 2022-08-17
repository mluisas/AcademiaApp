package letscode.projetostreinamento.academiaapp.controller;

import letscode.projetostreinamento.academiaapp.models.Treino;
import letscode.projetostreinamento.academiaapp.service.TreinoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/treino")
public class TreinoController {
    final TreinoService treinoService;

    public TreinoController(TreinoService treinoService) {
        this.treinoService = treinoService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Treino> getTreino(Integer id){
        return ResponseEntity.ok(treinoService.getTreino(id));
    }

    @GetMapping
    public ResponseEntity<List<Treino>> listAllTreino(){
        return ResponseEntity.ok(treinoService.listAllTreino());
    }

    @PostMapping
    public ResponseEntity<Treino> addTreino(@RequestBody Treino treino){
        return ResponseEntity.ok(treinoService.addTreino(treino));
    }

    @DeleteMapping
    public void delete(Integer id){
        treinoService.delete(id);
    }
}
