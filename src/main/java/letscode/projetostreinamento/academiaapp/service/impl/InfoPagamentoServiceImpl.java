package letscode.projetostreinamento.academiaapp.service.impl;

import letscode.projetostreinamento.academiaapp.models.InfoPagamento;
import letscode.projetostreinamento.academiaapp.repository.InfoPagamentoRepository;
import letscode.projetostreinamento.academiaapp.service.InfoPagamentoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InfoPagamentoServiceImpl implements InfoPagamentoService {

    final InfoPagamentoRepository infoPagamentoRepository;

    public InfoPagamentoServiceImpl(InfoPagamentoRepository infoPagamentoRepository) {
        this.infoPagamentoRepository = infoPagamentoRepository;
    }

    @Override
    public InfoPagamento getInfoPagamento(Integer id) {
        return this.infoPagamentoRepository.findById(id).orElseThrow(RuntimeException::new);
    }

    @Override
    public List<InfoPagamento> listAllInfoPagamento() {
        return this.infoPagamentoRepository.findAll();
    }

    @Override
    public InfoPagamento addInfoPagamento(InfoPagamento infoPagamento) {
        return this.infoPagamentoRepository.save(infoPagamento);
    }

    @Override
    public void delete(Integer id) {
        this.infoPagamentoRepository.deleteById(id);
    }
}
