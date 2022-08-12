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
    @Override
    public Instrutor getInstrutor(InfoPessoal infoPessoal) {
        return this.instrutorRepository.findById(infoPessoal).orElseThrow(RuntimeException::new);
    }

    @Override
    public List<Instrutor> listAllInstrutor() {
        return this.instrutorRepository.findAll();
    }

    @Override
    public void addInstrutor(Instrutor instrutor) {
        this.instrutorRepository.save(instrutor);
    }

    @Override
    public void delete(InfoPessoal infoPessoal) {
        this.instrutorRepository.deleteById(infoPessoal);
    }
}
