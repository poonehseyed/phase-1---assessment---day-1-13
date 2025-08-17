import model.Book;
import service.BookService;
import service.RegistrationService;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        BookService bookService = new BookService();
        Book bookInfo = bookService.addInfo();
        Book result = bookService.displayInfo(bookInfo.getId());
        System.out.println("Result book title:: " + result.getTitle());

        RegistrationService registrationService = new RegistrationService();
        System.out.println(registrationService.getMemberDetails("2").getId());
    }
}