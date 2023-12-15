package Lesson22.Task3;

public class NewBook implements Comparable<NewBook>{

    String title;
    String author;
    int price;
    Integer publicationYear;

    public NewBook(String title, String author, int price, int publicationYear) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.publicationYear = publicationYear;

    }

    @Override
    public int compareTo(NewBook price) {
        return this.price;
    }

    @Override
    public String toString() {
        return "Book: " +
                "title= " + title + '\'' +
                ", author= " + author + '\'' +
                ", price= " + price +
                ", publicationYear= " + publicationYear;
    }
}
