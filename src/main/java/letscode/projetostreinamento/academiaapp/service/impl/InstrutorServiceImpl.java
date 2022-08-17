package letscode.projetostreinamento.academiaapp.service.impl;

import letscode.projetostreinamento.academiaapp.models.Instrutor;
import letscode.projetostreinamento.academiaapp.repository.InstrutorRepository;
import letscode.projetostreinamento.academiaapp.service.InstrutorService;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@CacheConfig(cacheNames = {"instrutores"})
public class InstrutorServiceImpl implements InstrutorService {

    final InstrutorRepository instrutorRepository;

    public InstrutorServiceImpl(InstrutorRepository instrutorRepository) {
        this.instrutorRepository = instrutorRepository;
    }
    @Override
    @Cacheable
    public Instrutor getInstrutor(String cpf) {
        return this.instrutorRepository.findById(cpf).orElseThrow(RuntimeException::new);
    }

    @Override
    public List<Instrutor> listAllInstrutor() {
        return this.instrutorRepository.findAll();
    }

    @Override
    public Instrutor addInstrutor(Instrutor instrutor) {
        return this.instrutorRepository.save(instrutor);
    }

    @Override
    @CacheEvict
    public void delete(String cpf) {
        this.instrutorRepository.deleteById(cpf);
    }
}
