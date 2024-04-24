package jebi.hendardi.booklist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import jebi.hendardi.booklist.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

}
