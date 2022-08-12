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

    //TO-DO: IMPLEMENTAR CLASSE
    @Override
    public Treino getTreino(Integer id) {
        return null;
    }

    @Override
    public List<Treino> listAllTreino() {
        return null;
    }

    @Override
    public void addTreino(Treino treino) {

    }

    @Override
    public void delete(Integer id) {

    }
}
