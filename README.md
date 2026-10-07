## Name:Alan Kelly
## Student number: g00484675@atu.ie
## Lab Title: OOP Lab1 group A Book Tracker

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

## Name: Alan Kelly
## Student number: g00484675@atu.ie
## Lab 2: Encapsulated Library

## Run
Open the project in IntelliJ with JDK 24 and run Main.java.

## Seven day call and 15 day call
The seven day calls borrowBook() because 7>1 is true and 15 does not call borrowBook() because 15<14 is not true
the first book is available because it is returned with returnBook() before the 15 day call

## Why title, author and pageCount are final while status is not
title, author and page count are all fields that should not be change while status can be change by borrow.Book() and return.Book()

## Why Book uses borrowBook and returnBook rather than a status setter.
Book uses these methods so it has control of its states and enforces rules for changing state

## Which checks belong in Book and which belong in LibraryService.
the check are where they are because they check thing directly about the class they are in 
example: title,author and pagecount belong it book because they control key fields in the creation of book

## Outputs
successful loan: status changed to ON_LOAN
rejected loan: either "Book must not be null" and "Loan days must be from 1 to 14" error messages must be displayed
rejected return: "Book must not be null" error message is displayed

## Maven
[book-tracker-1.0-SNAPSHOT.jar](target/book-tracker-1.0-SNAPSHOT.jar)


## Lab-4 Collections
Lab 4 changes LibraryService from working with a single supplied Book to owning a
List<Book>.

## Explain what List<Book> tells the compiler.
List<Book> tells the complier that the list stores book.

## Explain why final does not prevent books.add(...).
Final means that the reference variable cannot be changed to point at a different list but final does not make the contents of the unchangeable.

## Explain what the enhanced for loop variable represents.
Book book represents the current book object being looked at each part of the loop,the Book variable is a reference to each Book object in the books list one at a time.

## Describe what findBookByTitle returns for a known and an unknown title.
if the book title exists the method returns the book object and there is error handling so "dune","Dune" and "DUNE" will match
and if it can't find a match it returns null.

## Explain why removeBook reuses findBookByTitle instead of writing another search loop.
removeBook reuses findBookByTitle so you do not look for a book twice and also code reuse is good practice and makes the code easier to maintain.

## Explain which responsibilities belong to Main, LibraryService and Book.
Main is responsible for running and demonstrating the program in this example it creates Book objects,creates the LibraryService, Adds books to the library ,Calls methods such as loanBook(), returnBook() and removeBook() and prints outputs to the console

LibraryService is responsible for managing the collection of books.
it contains the Array list used to store the books. private final List<Book> books = new ArrayList<Book>();
it also provides operations such as :
addBook()
findBookByTitle()
removeBook()
loanBook()
returnBook()
getBookCount()
getAllBooks()

Book is responsible for representing one individual book and managing its own sate.
it stores:
private final String title;
private final String author;
private final int pageCount;
private BookStatus status;

it also controls if a book is available or on loan

## Maven
[book-tracker-1.0-SNAPSHOT.jar](target/book-tracker-1.0-SNAPSHOT.jar)