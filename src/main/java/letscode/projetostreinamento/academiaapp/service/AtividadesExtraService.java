package letscode.projetostreinamento.academiaapp.service;

import letscode.projetostreinamento.academiaapp.dto.atividadeExtra.AtividadeExtraRequestDto;
import letscode.projetostreinamento.academiaapp.dto.atividadeExtra.AtividadeExtraResponseDto;
import letscode.projetostreinamento.academiaapp.models.AtividadesExtra;

import java.util.List;

public interface AtividadesExtraService {
    List<AtividadeExtraResponseDto> listAllAtividadesExtra(String cpf);
    AtividadesExtra addAtividadesExtra(AtividadeExtraRequestDto atividadesExtraDto);
    void delete(Integer id);
}
