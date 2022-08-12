package letscode.projetostreinamento.academiaapp.service.impl;

import letscode.projetostreinamento.academiaapp.models.Exercicio;
import letscode.projetostreinamento.academiaapp.repository.ExercicioRepository;
import letscode.projetostreinamento.academiaapp.service.ExercicioService;

import java.util.List;

public class ExercicioServiceImpl implements ExercicioService {

    final ExercicioRepository exercicioRepository;

    public ExercicioServiceImpl(ExercicioRepository exercicioRepository) {
        this.exercicioRepository = exercicioRepository;
    }

    //TO-DO: IMPLEMENTAR CLASSE
    @Override
    public Exercicio getExercicio(Integer id) {
        return null;
    }

    @Override
    public List<Exercicio> listAllExercicio() {
        return null;
    }

    @Override
    public void addExercicio(Exercicio exercicio) {

    }

    @Override
    public void delete(Integer id) {

    }
}
