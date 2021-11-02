package fabrick.appFabrick.repository;

import fabrick.appFabrick.model.Conto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContoRepository extends JpaRepository<Conto,Long> {
}
