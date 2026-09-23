package ie.atu.oop.week1;

public class Book {
    public String title;
    public String author;
    public int pageCount;
    public boolean available;

    public Book(){

    }
    public void displayDetails(){
        System.out.println("the title of this book is " + title);
        System.out.println("the books author is " + author);
        System.out.println("the books page count is " + pageCount);
        System.out.println("the status of this book is " +available);
        System.out.println("\n");
    }

    public void borrowBook()
    {
        if(available)
        {
            available = false;
            System.out.println(title+" borrowed confirmed.");
        }
        else
        {
            System.out.println(title+" has been borrowed.");
        }
    }
}
