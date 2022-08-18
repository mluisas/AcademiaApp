package letscode.projetostreinamento.academiaapp.controller;

import letscode.projetostreinamento.academiaapp.dto.exercicio.ExercicioRequestDto;
import letscode.projetostreinamento.academiaapp.dto.exercicio.ExercicioResponseDto;
import letscode.projetostreinamento.academiaapp.service.ExercicioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/exercicio")
public class ExercicioController {

    final ExercicioService exercicioService;

    public ExercicioController(ExercicioService exercicioService) {
        this.exercicioService = exercicioService;
    }

    @PostMapping
    public ResponseEntity<ExercicioResponseDto> addExercicio(@RequestBody ExercicioRequestDto exercicioRequestDto){
        return ResponseEntity.ok(exercicioService.addExercicio(exercicioRequestDto));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathParam("id") Integer id){
        exercicioService.delete(id);
    }
}
