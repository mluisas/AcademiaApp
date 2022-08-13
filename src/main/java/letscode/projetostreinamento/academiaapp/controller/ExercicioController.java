package letscode.projetostreinamento.academiaapp.controller;

import letscode.projetostreinamento.academiaapp.models.Exercicio;
import letscode.projetostreinamento.academiaapp.service.ExercicioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/exercicio")
public class ExercicioController {

    final ExercicioService exercicioService;

    public ExercicioController(ExercicioService exercicioService) {
        this.exercicioService = exercicioService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Exercicio> getExercicio(@PathParam("id") Integer id){
        return ResponseEntity.ok(exercicioService.getExercicio(id));
    }

    @GetMapping
    public ResponseEntity<List<Exercicio>> listAllExercicio(){
        return ResponseEntity.ok(exercicioService.listAllExercicio());
    }

    @PostMapping
    public ResponseEntity<Exercicio> addExercicio(@RequestBody Exercicio exercicio){
        return ResponseEntity.ok(exercicioService.addExercicio(exercicio));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathParam("id") Integer id){
        exercicioService.delete(id);
    }
}
