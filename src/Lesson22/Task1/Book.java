package Lesson22.Task1;

public class Book implements Comparable <Book> {

    String title;
    String author;
    int price;


    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    public int compareTo(Book o) {
        return Integer.compare(this.price,o.price);
    }

    @Override
    public String toString() {
        return "Book: " +
                " title= '" + title + '\'' +
                ", author= '" + author + '\'' +
                ", price= " + price ;
    }


}



