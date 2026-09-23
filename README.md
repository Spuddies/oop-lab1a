Name:Alan Kelly
Student number: g00484675@atu.ie
Lab Title: OOP Lab1 group A Book Tracker

## Run
Open the project in IntelliJ with JDK 24 and run Main.java.

## Object model
Book defines a class that contains 4 fields and can be copied and reused for a book tracker system.

public String title;

public String author;

public int pageCount;

public boolean available 

firstBook is a copy of the Book class and contains 4 fields that is created and can be modified by the helper method createBook.

public String title;

public String author;

public int pageCount;

public boolean available

secondBook and thirdBook are the same as first book.

borrowBook()
checks if the available field is true and if it is
it changes it to false and displays a message that the book has been borrowed.

createBook() is separate from main so it can be reused instead of using duplicate code and java does not let you define a method inside another method.

## Verification
When the program starts hello world is printed to the console then the first object is created firstBook and populated then secondBook and thirdBook are made and populated then firstBook,secondBook and thirdBook displayDetails is called then firstBook.borrowBook() is called and firstBook.available is changed to false and firstBook.displayDetails is called again to check if the staus as been changed.