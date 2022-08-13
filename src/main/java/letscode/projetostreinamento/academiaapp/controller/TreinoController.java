package letscode.projetostreinamento.academiaapp.controller;

import letscode.projetostreinamento.academiaapp.models.Treino;
import letscode.projetostreinamento.academiaapp.service.TreinoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/treino")
public class TreinoController {
    final TreinoService treinoService;

    public TreinoController(TreinoService treinoService) {
        this.treinoService = treinoService;
    }

    public ResponseEntity<Treino> getTreino(Integer id){
        return ResponseEntity.ok(treinoService.getTreino(id));
    }

    public ResponseEntity<List<Treino>> listAllTreino(){
        return ResponseEntity.ok(treinoService.listAllTreino());
    }

    public ResponseEntity<Treino> addTreino(Treino treino){
        return ResponseEntity.ok(treinoService.addTreino(treino));
    }

    public void delete(Integer id){
        treinoService.delete(id);
    }
}
