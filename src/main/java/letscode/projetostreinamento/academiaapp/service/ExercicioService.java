package letscode.projetostreinamento.academiaapp.service;

import letscode.projetostreinamento.academiaapp.models.Exercicio;

import java.util.List;

public interface ExercicioService {
    Exercicio getExercicio(Integer id);
    List<Exercicio> listAllExercicio();
    void addExercicio(Exercicio exercicio);
    void delete(Integer id);
}
