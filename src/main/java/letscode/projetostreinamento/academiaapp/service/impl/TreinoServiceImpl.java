package letscode.projetostreinamento.academiaapp.service.impl;

import letscode.projetostreinamento.academiaapp.models.Treino;
import letscode.projetostreinamento.academiaapp.repository.TreinoRepository;
import letscode.projetostreinamento.academiaapp.service.TreinoService;

import java.util.List;

public class TreinoServiceImpl implements TreinoService {

    final TreinoRepository treinoRepository;

    public TreinoServiceImpl(TreinoRepository treinoRepository) {
        this.treinoRepository = treinoRepository;
    }

    @Override
    public Treino getTreino(Integer id) {
        return this.treinoRepository.findById(id).orElseThrow(RuntimeException::new);
    }

    @Override
    public List<Treino> listAllTreino() {
        return this.treinoRepository.findAll();
    }

    @Override
    public void addTreino(Treino treino) {
        this.treinoRepository.save(treino);
    }

    @Override
    public void delete(Integer id) {
        this.treinoRepository.deleteById(id);
    }
}
