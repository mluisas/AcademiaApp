package letscode.projetostreinamento.academiaapp.service.impl;

import letscode.projetostreinamento.academiaapp.dto.exercicio.ExercicioRequestDto;
import letscode.projetostreinamento.academiaapp.dto.exercicio.ExercicioResponseDto;
import letscode.projetostreinamento.academiaapp.models.Exercicio;
import letscode.projetostreinamento.academiaapp.repository.ExercicioRepository;
import letscode.projetostreinamento.academiaapp.repository.TreinoRepository;
import letscode.projetostreinamento.academiaapp.service.ExercicioService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExercicioServiceImpl implements ExercicioService {

    final ExercicioRepository exercicioRepository;
    final TreinoRepository treinoRepository;

    public ExercicioServiceImpl(ExercicioRepository exercicioRepository, TreinoRepository treinoRepository) {
        this.exercicioRepository = exercicioRepository;
        this.treinoRepository = treinoRepository;
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
    public ExercicioResponseDto addExercicio(ExercicioRequestDto exercicioRequestDto) {
        ExercicioResponseDto exercicioResponseDto = new ExercicioResponseDto();
        Exercicio exercicio = new Exercicio();

        exercicio.setNome(exercicioRequestDto.getNome());
        exercicio.setUrlVideoDemonstracao(exercicioRequestDto.getUrlVideoDemonstracao());
        exercicio.setTreino(treinoRepository.findById(exercicioRequestDto.getTreinoId()).orElseThrow(RuntimeException::new));

        exercicioRepository.save(exercicio);

        exercicioResponseDto.setNome(exercicio.getNome());
        exercicioResponseDto.setNomeInstrutor(exercicio.getTreino().getInstrutor().getNome());
        exercicioResponseDto.setNomeCliente(exercicio.getTreino().getCliente().getNome());
        exercicioResponseDto.setUrlVideoDemonstracao(exercicio.getUrlVideoDemonstracao());
        exercicioResponseDto.setTreinoId(exercicio.getTreino().getId());

        return exercicioResponseDto;
    }

    @Override
    public void delete(Integer id) {
        this.exercicioRepository.deleteById(id);
    }
}
