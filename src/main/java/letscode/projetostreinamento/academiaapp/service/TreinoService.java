package letscode.projetostreinamento.academiaapp.service;

import letscode.projetostreinamento.academiaapp.dto.treino.TreinoRequestDto;
import letscode.projetostreinamento.academiaapp.dto.treino.TreinoResponseDto;
import letscode.projetostreinamento.academiaapp.models.Treino;

import java.util.List;

public interface TreinoService {
    Treino getTreino(Integer id);
    List<TreinoResponseDto> listAllTreino(String cpf);
    TreinoResponseDto addTreino(TreinoRequestDto treinoRequestDto);
    void delete(Integer id);
}
