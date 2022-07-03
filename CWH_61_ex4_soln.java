package com.company;

class Library{
    String []books;
    int no_of_books = 0;
    Library(){
        this.books = new String[100];
        this.no_of_books = 0;
    }
    void addBook(String book){
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book + " has been added");
    }

    void showAvailableBooks(){
        System.out.println("Available Books are:");
        for (String book : this.books){
            if (book == null){
                continue;
            }
            System.out.println("* " + book);
        }
    }

    void issueBook(String book){
        for (int i=0; i <this.books.length; i++){
            String b = this.books[i];
            if (b == book){
                System.out.println("The book has been issued!");
                b = null;
                return;
            }

        }
        System.out.println("This book does not exists");
    }
    void returnBook(String book){
        addBook(book);
    }
}

public class CWH_61_ex4_soln {
    public static void main(String[] args) {
        //class library
        //methods: addBook, issueBook, returnBook, showAvailableBooks
        //Properties: Array to store the available books
        //Array to store the issued books
        Library centralLibrary = new Library();
        centralLibrary.addBook("Rich Dad Poor Dad");
        centralLibrary.addBook("Secret");
        centralLibrary.addBook("C++");
        centralLibrary.showAvailableBooks();
        centralLibrary.issueBook("C++");
        centralLibrary.returnBook("C++");
        centralLibrary.showAvailableBooks();
    }
}
