package letscode.projetostreinamento.academiaapp.service;

import letscode.projetostreinamento.academiaapp.models.AtividadesExtra;

import java.util.List;

public interface AtividadesExtraService {
    AtividadesExtra getAtividadesExtra(Integer id);
    List<AtividadesExtra> listAllAtividadesExtra();
    AtividadesExtra addAtividadesExtra(AtividadesExtra atividadesExtra);
    void delete(Integer id);
}
