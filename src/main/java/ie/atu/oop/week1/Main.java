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

        System.out.println("the title of this book is " + firstBook.title);
        System.out.println("the books author is " + firstBook.author);
        System.out.println("the books page count is " + firstBook.pageCount);
        System.out.println("the status of this book is " + firstBook.available);

    }
}