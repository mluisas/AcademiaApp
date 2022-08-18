package letscode.projetostreinamento.academiaapp.repository;

import letscode.projetostreinamento.academiaapp.models.Treino;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TreinoRepository extends JpaRepository<Treino, Integer> {

    List<Treino> findAllByClienteCpf(String cpf);
}
