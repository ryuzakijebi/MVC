package jebi.hendardi.booklist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import jebi.hendardi.booklist.entity.Book;
import jebi.hendardi.booklist.service.BookService;

@Controller
public class BookController {
    private BookService bookService;
    public BookController(BookService bookService) {
        super();
        this.bookService = bookService;
    }

    @GetMapping("/books")
    public String listBooks(Model model) {
        model.addAttribute("books", bookService.getAllBooks());
        return "books";
    }

    @GetMapping("/books/new")
    public String createBookForm(Model model) {
        Book book = new Book();
        model.addAttribute("book", book);
        return "create_book";
    }

    @PostMapping("/books")
    public String saveBook(@ModelAttribute("book") Book book) {
        bookService.saveBook(book);
        return "redirect:/books";
    }

    @GetMapping("/books/edit/{id}")
    public String editBookForm(@PathVariable Long id, Model model) {
        model.addAttribute("book", bookService.getBookById(id));
        return "edit_book";
    }

    @PostMapping("/books/{id}")
    public String updateBook(@PathVariable Long id,
                             @ModelAttribute("book") Book book,
                             Model model) {
        Book existingBook = bookService.getBookById(id);
        existingBook.setJudulBuku(book.getJudulBuku());
        existingBook.setPenulis(book.getPenulis());
        existingBook.setTahunTerbit(book.getTahunTerbit());
        existingBook.setPenerbit(book.getPenerbit());
        bookService.updateBook(existingBook);
        return "redirect:/books";
    }

    @GetMapping("/books/delete/{id}")
    public String deleteBook(@PathVariable Long id) {
        bookService.deleteBookById(id);
        return "redirect:/books";
    }

    @GetMapping("/book")
    public String getBookPage() {
        return "books";
    }

}
