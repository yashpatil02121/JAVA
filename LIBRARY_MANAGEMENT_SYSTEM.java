package com.company;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

class Book{
    public String name, author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}

class MyLibrary{
    public ArrayList<Book> books;
    public MyLibrary(ArrayList<Book> books) {
        this.books = books;
    }
    public void addBook(Book book){
        System.out.println("The book has been added to the library");
        this.books.add(book);
    }
    public void issueBook(Book book, String issued_to){
        System.out.println("The book has been issued from the library to " + issued_to);
        this.books.remove(book);
    }
    public void returnBook(Book b){
        System.out.println("The book has been returned");
        this.books.add(b);
    }
}

//class card{
//    public String name(){
//        System.out.println("Enter your name:");
//        String name = br.readline
//    }
//}

public class LIBRARY_MANAGEMENT_SYSTEM {
    public static void main(String[] args) {

        ArrayList<Book> bk = new ArrayList<>();
        int n = 1;
        while (n != 4) {
            System.out.println("Enter 1 for library card.\n      2 for library info.\n      3 for book info.\n      4 to exit the site");
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.println("Library card:");
                    System.out.println("Enter your name:");
                    String name = sc.next();
                    System.out.println("Mobile number:");
                    int mob = sc.nextInt();
                    System.out.println("Enter your address:");
                    String add = sc.nextLine();

            }


//        Book b1 = new Book("Algorithms", "CLRS");
//        bk.add(b1);
//
//        Book b2 = new Book("Algorithms2", "CLRS2");
//        bk.add(b2);
//
//        Book b3 = new Book("Algorithms3", "CLRS3");
//        bk.add(b3);
//
//        Book b4 = new Book("Algorithms4", "CLRS4");
//        bk.add(b4);
//        MyLibrary l = new MyLibrary(bk);
//        l.addBook(new Book("algo4", "myAuthor"));
//        System.out.println(l.books);
//        l.issueBook(b3, "Harry");
//        System.out.println(l.books);

        }
    }
}
