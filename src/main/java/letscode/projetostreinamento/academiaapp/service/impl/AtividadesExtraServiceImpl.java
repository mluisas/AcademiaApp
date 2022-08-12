package letscode.projetostreinamento.academiaapp.service.impl;

import letscode.projetostreinamento.academiaapp.models.AtividadesExtra;
import letscode.projetostreinamento.academiaapp.repository.AtividadesExtraRepository;
import letscode.projetostreinamento.academiaapp.service.AtividadesExtraService;

import java.util.List;

public class AtividadesExtraServiceImpl implements AtividadesExtraService {

    final AtividadesExtraRepository atividadesExtraRepository;

    public AtividadesExtraServiceImpl(AtividadesExtraRepository atividadesExtraRepository) {
        this.atividadesExtraRepository = atividadesExtraRepository;
    }

    //TO-DO: IMPLEMENTAR CLASSE
    @Override
    public AtividadesExtra getAtividadesExtra(Integer id) {
        return null;
    }

    @Override
    public List<AtividadesExtra> listAllAtividadesExtra() {
        return null;
    }

    @Override
    public void addAtividadesExtra(AtividadesExtra atividadesExtra) {

    }

    @Override
    public void delete(Integer id) {

    }
}
