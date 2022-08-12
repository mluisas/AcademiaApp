package letscode.projetostreinamento.academiaapp.service.impl;

import letscode.projetostreinamento.academiaapp.models.InfoPagamento;
import letscode.projetostreinamento.academiaapp.repository.InfoPagamentoRepository;
import letscode.projetostreinamento.academiaapp.service.InfoPagamentoService;

import java.util.List;

public class InfoPagamentoServiceImpl implements InfoPagamentoService {

    final InfoPagamentoRepository infoPagamentoRepository;

    public InfoPagamentoServiceImpl(InfoPagamentoRepository infoPagamentoRepository) {
        this.infoPagamentoRepository = infoPagamentoRepository;
    }

    //TO-DO: IMPLEMENTAR CLASSE
    @Override
    public InfoPagamento getInfoPagamento(Integer id) {
        return null;
    }

    @Override
    public List<InfoPagamento> listAllInfoPagamento() {
        return null;
    }

    @Override
    public void addInfoPagamento(InfoPagamento infoPagamento) {

    }

    @Override
    public void delete(Integer id) {

    }
}
