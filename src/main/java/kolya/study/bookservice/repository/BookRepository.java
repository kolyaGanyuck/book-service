package kolya.study.bookservice.repository;

import kolya.study.bookservice.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface BookRepository extends JpaRepository<Book, Long> {
    Optional<Book> findByTitle(String title);
    List<Book> findAllByTitleIgnoreCase(String title);
    List<Book> findAllByTitleContainingIgnoreCase(String title);

}
