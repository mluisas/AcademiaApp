package letscode.projetostreinamento.academiaapp.service.impl;

import letscode.projetostreinamento.academiaapp.dto.atividadeExtra.AtividadeExtraRequestDto;
import letscode.projetostreinamento.academiaapp.dto.atividadeExtra.AtividadeExtraResponseDto;
import letscode.projetostreinamento.academiaapp.models.AtividadesExtra;
import letscode.projetostreinamento.academiaapp.models.Cliente;
import letscode.projetostreinamento.academiaapp.repository.AtividadesExtraRepository;
import letscode.projetostreinamento.academiaapp.repository.ClienteRepository;
import letscode.projetostreinamento.academiaapp.service.AtividadesExtraService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class AtividadesExtraServiceImpl implements AtividadesExtraService {

    final AtividadesExtraRepository atividadesExtraRepository;
    final ClienteRepository clienteRepository;

    public AtividadesExtraServiceImpl(AtividadesExtraRepository atividadesExtraRepository, ClienteRepository clienteRepository) {
        this.atividadesExtraRepository = atividadesExtraRepository;
        this.clienteRepository = clienteRepository;
    }

    @Override
    public List<AtividadeExtraResponseDto> listAllAtividadesExtra(String cpf) {
        List<AtividadeExtraResponseDto> atividadeExtraResponseDtoList = new ArrayList<>();
        List<AtividadesExtra> atividadesExtraList = atividadesExtraRepository.findAllByClienteCpf(cpf);

        atividadesExtraList.forEach(atividades -> {
            AtividadeExtraResponseDto atividadeExtraResponseDto = new AtividadeExtraResponseDto();
            atividadeExtraResponseDto.setNome(atividades.getNome());
            atividadeExtraResponseDto.setHora(atividades.getHora());
            atividadeExtraResponseDto.setMinuto(atividades.getMinuto());
            atividadeExtraResponseDto.setDiaDaSemana(atividades.getDiaDaSemana());
            atividadeExtraResponseDto.setId(atividades.getId());
            atividadeExtraResponseDto.setCpfCliente(atividades.getCliente().getCpf());
            atividadeExtraResponseDto.setNomeCliente(atividades.getCliente().getNome());

            atividadeExtraResponseDtoList.add(atividadeExtraResponseDto);
        });

        return atividadeExtraResponseDtoList;
    }

    @Override
    public AtividadesExtra addAtividadesExtra(AtividadeExtraRequestDto atividadesExtraDto) {
        AtividadesExtra atividadesExtra = new AtividadesExtra();
        Cliente cliente = clienteRepository.findById(atividadesExtraDto.getCpfCliente())
                .orElseThrow(RuntimeException::new);

        atividadesExtra.setHora(atividadesExtraDto.getHora());
        atividadesExtra.setMinuto(atividadesExtraDto.getMinuto());
        atividadesExtra.setNome(atividadesExtraDto.getNome());
        atividadesExtra.setDiaDaSemana(atividadesExtraDto.getDiaDaSemana());
        atividadesExtra.setCliente(cliente);

        return this.atividadesExtraRepository.save(atividadesExtra);
    }

    @Override
    public void delete(Integer id) {
        this.atividadesExtraRepository.deleteById(id);
    }
}
