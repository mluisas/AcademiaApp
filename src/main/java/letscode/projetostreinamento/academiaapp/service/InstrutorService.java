package letscode.projetostreinamento.academiaapp.service;

import letscode.projetostreinamento.academiaapp.models.Instrutor;

import java.util.List;

public interface InstrutorService {
    Instrutor getInstrutor(String cpf);
    List<Instrutor> listAllInstrutor();
    Instrutor addInstrutor(Instrutor instrutor);
    void delete(String cpf);
}
