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

    @Override
    public Exercicio getExercicio(Integer id) {
        return this.exercicioRepository.findById(id).orElseThrow(RuntimeException::new);
    }

    @Override
    public List<Exercicio> listAllExercicio() {
        return this.exercicioRepository.findAll();
    }

    @Override
    public void addExercicio(Exercicio exercicio) {
        this.exercicioRepository.save(exercicio);
    }

    @Override
    public void delete(Integer id) {
        this.exercicioRepository.deleteById(id);
    }
}
