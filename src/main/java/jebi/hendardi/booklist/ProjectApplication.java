package jebi.hendardi.booklist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import jebi.hendardi.booklist.entity.Book;
import jebi.hendardi.booklist.repository.BookRepository;

@SpringBootApplication
public class ProjectApplication implements CommandLineRunner{
	public static void main(String[] args) {
		SpringApplication.run(ProjectApplication.class, args);
	}

	@Autowired
	private BookRepository bookRepository;

	@Override
	public void run(String... args) throws Exception {

	}
}
