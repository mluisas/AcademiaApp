package letscode.projetostreinamento.academiaapp.service.impl;

import letscode.projetostreinamento.academiaapp.dto.treino.TreinoRequestDto;
import letscode.projetostreinamento.academiaapp.dto.treino.TreinoResponseDto;
import letscode.projetostreinamento.academiaapp.models.Cliente;
import letscode.projetostreinamento.academiaapp.models.Instrutor;
import letscode.projetostreinamento.academiaapp.models.Treino;
import letscode.projetostreinamento.academiaapp.repository.ClienteRepository;
import letscode.projetostreinamento.academiaapp.repository.InstrutorRepository;
import letscode.projetostreinamento.academiaapp.repository.TreinoRepository;
import letscode.projetostreinamento.academiaapp.service.TreinoService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TreinoServiceImpl implements TreinoService {

    final TreinoRepository treinoRepository;
    final ClienteRepository clienteRepository;
    final InstrutorRepository instrutorRepository;

    public TreinoServiceImpl(TreinoRepository treinoRepository, ClienteRepository clienteRepository, InstrutorRepository instrutorRepository) {
        this.treinoRepository = treinoRepository;
        this.clienteRepository = clienteRepository;
        this.instrutorRepository = instrutorRepository;
    }

    @Override
    public Treino getTreino(Integer id) {
        return this.treinoRepository.findById(id).orElseThrow(RuntimeException::new);
    }

    @Override
    public List<TreinoResponseDto> listAllTreino(String cpf) {
        List<TreinoResponseDto> listaTreinoResponseDto = new ArrayList<>();
        List<Treino> listaTreinos = treinoRepository.findAllByClienteCpf(cpf);

        listaTreinos.forEach(treino -> {
            TreinoResponseDto treinoResponseDto = new TreinoResponseDto();
            treinoResponseDto.setId(treino.getId());
            treinoResponseDto.setClienteCpf(treino.getCliente().getCpf());
            treinoResponseDto.setInstrutorCpf(treino.getInstrutor().getCpf());

            listaTreinoResponseDto.add(treinoResponseDto);
        });

        return listaTreinoResponseDto;
    }

    @Override
    public TreinoResponseDto addTreino(TreinoRequestDto treinoRequestDto) {
        TreinoResponseDto treinoResponseDto = new TreinoResponseDto();

        Cliente cliente = clienteRepository.findById(treinoRequestDto.getClienteCpf())
                .orElseThrow(RuntimeException::new);

        Instrutor instrutor = instrutorRepository.findById(treinoRequestDto.getInstrutorCpf())
                .orElseThrow(RuntimeException::new);

        Treino treino = new Treino();
        treino.setCliente(cliente);
        treino.setInstrutor(instrutor);

        Integer id = treinoRepository.save(treino).getId();
        treinoResponseDto.setClienteCpf(treinoRequestDto.getClienteCpf());
        treinoResponseDto.setInstrutorCpf(treinoRequestDto.getInstrutorCpf());
        treinoResponseDto.setId(id);

        return treinoResponseDto;
    }

    @Override
    public void delete(Integer id) {
        this.treinoRepository.deleteById(id);
    }
}
