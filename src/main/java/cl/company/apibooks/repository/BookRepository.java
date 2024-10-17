package cl.company.apibooks.repository;

import cl.company.apibooks.model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Libro,Long> {
}
