package letscode.projetostreinamento.academiaapp.repository;

import letscode.projetostreinamento.academiaapp.models.InfoPessoal;
import letscode.projetostreinamento.academiaapp.models.Instrutor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstrutorRepository extends JpaRepository<Instrutor, InfoPessoal> {
}
