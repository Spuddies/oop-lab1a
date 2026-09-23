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
        System.out.println("\n");

        Book secondBook = new Book();
        secondBook.title = "the life and times of thunderbolt";
        secondBook.author = "Frank Black";
        secondBook.pageCount = 12;
        secondBook.available = true;

        System.out.println("the title of this book is " + secondBook.title);
        System.out.println("the books author is " + secondBook.author);
        System.out.println("the books page count is " + secondBook.pageCount);
        System.out.println("the status of this book is " + secondBook.available);
        System.out.println("\n");

    }
}