package letscode.projetostreinamento.academiaapp.service.impl;

import letscode.projetostreinamento.academiaapp.models.InfoPessoal;
import letscode.projetostreinamento.academiaapp.models.Instrutor;
import letscode.projetostreinamento.academiaapp.repository.InstrutorRepository;
import letscode.projetostreinamento.academiaapp.service.InstrutorService;

import java.util.List;

public class InstrutorServiceImpl implements InstrutorService {

    final InstrutorRepository instrutorRepository;

    public InstrutorServiceImpl(InstrutorRepository instrutorRepository) {
        this.instrutorRepository = instrutorRepository;
    }

    //TO-DO: IMPLEMENTAR CLASSE
    @Override
    public Instrutor getInstrutor(InfoPessoal infoPessoal) {
        return null;
    }

    @Override
    public List<Instrutor> listAllInstrutor() {
        return null;
    }

    @Override
    public void addInstrutor(Instrutor instrutor) {

    }

    @Override
    public void delete(InfoPessoal infoPessoal) {

    }
}
