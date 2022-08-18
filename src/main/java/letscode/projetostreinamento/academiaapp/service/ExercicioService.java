package letscode.projetostreinamento.academiaapp.service;

import letscode.projetostreinamento.academiaapp.dto.exercicio.ExercicioRequestDto;
import letscode.projetostreinamento.academiaapp.dto.exercicio.ExercicioResponseDto;
import letscode.projetostreinamento.academiaapp.models.Exercicio;

import java.util.List;

public interface ExercicioService {
    Exercicio getExercicio(Integer id);
    List<Exercicio> listAllExercicio();
    ExercicioResponseDto addExercicio(ExercicioRequestDto exercicioRequestDto);
    void delete(Integer id);
}
