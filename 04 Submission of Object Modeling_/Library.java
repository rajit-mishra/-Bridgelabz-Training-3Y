
import java.util.ArrayList;

class Book {
    private String title;
    private String author;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    public void displayBook(){
        System.out.println("Book Title: "+title+", Author: "+author);
    }
}

public class Library {
    private String name;
    private ArrayList<Book> books;

    public Library(String name){
        this.name = name;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book){
        this.books.add(book);
    }

    public void showBooks(){
        System.out.println("Library: " + name);
        for(Book b : books){
            b.displayBook();
        }
        System.out.println();
    }

    public static void main(String[] args){
        Book b1 = new Book("1984", "George Orwell");
        Book b2 = new Book("To Kill a Mockingbird", "Harper Lee");
        Book b3 = new Book("Moby Dick", "Herman Melville");

        Library lib1 = new Library("Central Library");
        Library lib2 = new Library("Community Library");

        lib1.addBook(b1);
        lib1.addBook(b2);

        lib2.addBook(b2);
        lib2.addBook(b3);

        lib1.showBooks();
        lib2.showBooks();
    }
}
