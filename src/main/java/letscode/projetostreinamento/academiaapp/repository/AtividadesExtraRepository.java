package letscode.projetostreinamento.academiaapp.repository;

import letscode.projetostreinamento.academiaapp.models.AtividadesExtra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AtividadesExtraRepository extends JpaRepository<AtividadesExtra, Integer> {
}
