package ie.atu.oop.week1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Book first = new Book("Dune", "Frank Herbert", 412);
        Book second = new Book("Clean Code", "Robert C. Martin", 464);
        LibraryService service = new LibraryService();

        service.addBook(first);
        service.addBook(second);

        System.out.println("We have " + service.getBookCount() + " books.");

        for (Book book : service.getAllBooks()) {
            System.out.println(book.getTitle());
        }
        Book found = service.findBookByTitle("Dune");
        if (found != null) {
            System.out.println("Found: " + found.getTitle());
        }
        Book missing = service.findBookByTitle("The Hobbit");
        if (missing == null) {
            System.out.println("The Hobbit was not found");
        }
    }
}