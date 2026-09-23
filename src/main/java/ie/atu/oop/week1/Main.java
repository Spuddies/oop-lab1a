package ie.atu.oop.week1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello World");

        Book firstBook = new Book();
        firstBook.title = "Dune";
        firstBook.author = "Frank Herbert";
        firstBook.pageCount = 412;
        firstBook.available = true;


        Book secondBook = new Book();
        secondBook.title = "the life and times of thunderbolt";
        secondBook.author = "Frank Black";
        secondBook.pageCount = 12;
        secondBook.available = true;

        firstBook.displayDetails();
        firstBook.borrowBook();
        firstBook.displayDetails();
        secondBook.displayDetails();

    }
}