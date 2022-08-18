package letscode.projetostreinamento.academiaapp.repository;

import letscode.projetostreinamento.academiaapp.models.Exercicio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExercicioRepository extends JpaRepository<Exercicio, Integer> {
}
