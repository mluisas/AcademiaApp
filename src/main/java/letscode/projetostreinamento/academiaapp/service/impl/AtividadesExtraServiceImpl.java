package letscode.projetostreinamento.academiaapp.service.impl;

import letscode.projetostreinamento.academiaapp.models.AtividadesExtra;
import letscode.projetostreinamento.academiaapp.repository.AtividadesExtraRepository;
import letscode.projetostreinamento.academiaapp.service.AtividadesExtraService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AtividadesExtraServiceImpl implements AtividadesExtraService {

    final AtividadesExtraRepository atividadesExtraRepository;

    public AtividadesExtraServiceImpl(AtividadesExtraRepository atividadesExtraRepository) {
        this.atividadesExtraRepository = atividadesExtraRepository;
    }

    @Override
    public AtividadesExtra getAtividadesExtra(Integer id) {
        return this.atividadesExtraRepository.findById(id).orElseThrow(RuntimeException::new);
    }

    @Override
    public List<AtividadesExtra> listAllAtividadesExtra() {
        return this.atividadesExtraRepository.findAll();
    }

    @Override
    public AtividadesExtra addAtividadesExtra(AtividadesExtra atividadesExtra) {
        return this.atividadesExtraRepository.save(atividadesExtra);
    }

    @Override
    public void delete(Integer id) {
        this.atividadesExtraRepository.deleteById(id);
    }
}
