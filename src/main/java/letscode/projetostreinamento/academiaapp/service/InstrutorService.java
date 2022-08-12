package letscode.projetostreinamento.academiaapp.service;

import letscode.projetostreinamento.academiaapp.models.InfoPessoal;
import letscode.projetostreinamento.academiaapp.models.Instrutor;

import java.util.List;

public interface InstrutorService {
    Instrutor getInstrutor(InfoPessoal infoPessoal);
    List<Instrutor> listAllInstrutor();
    void addInstrutor(Instrutor instrutor);
    void delete(InfoPessoal infoPessoal);
}
