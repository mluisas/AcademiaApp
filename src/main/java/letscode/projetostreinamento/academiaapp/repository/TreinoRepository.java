package letscode.projetostreinamento.academiaapp.repository;

import letscode.projetostreinamento.academiaapp.models.Treino;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TreinoRepository extends JpaRepository<Treino, Integer> {
}
