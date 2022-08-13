package letscode.projetostreinamento.academiaapp.service;

import letscode.projetostreinamento.academiaapp.models.InfoPagamento;

import java.util.List;

public interface InfoPagamentoService {
    InfoPagamento getInfoPagamento(Integer id);
    List<InfoPagamento> listAllInfoPagamento();
    InfoPagamento addInfoPagamento(InfoPagamento infoPagamento);
    void delete(Integer id);
}
