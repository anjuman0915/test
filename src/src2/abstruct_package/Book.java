package src2.abstruct_package;

public class Book {
    private String title;
    private int isbn;
    private int price;
    private String author;
    private String Author;

    Book(String title, int isbn, int price, Author author){
        this.title= title;
        this.isbn= isbn;
        this.price=price;
        this.author= author.toString();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        this.author =Author;
    }

    Book(String title, String author, int isbn, int price ){

    }
}
