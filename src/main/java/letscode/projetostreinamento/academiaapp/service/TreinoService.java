package letscode.projetostreinamento.academiaapp.service;

import letscode.projetostreinamento.academiaapp.models.Treino;

import java.util.List;

public interface TreinoService {
    Treino getTreino(Integer id);
    List<Treino> listAllTreino();
    Treino addTreino(Treino treino);
    void delete(Integer id);
}
