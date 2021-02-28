package Advanced.day2.HashMap.BookTest;

import java.util.Objects;

public class Book {
    private Integer number;
    private String bookName;
    private String authorName;
    private Double price;

    public Book(Integer number, String bookName, String authorName, Double price) {
        this.number = number;
        this.bookName = bookName;
        this.authorName = authorName;
        this.price = price;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "number=" + number +
                ", bookName='" + bookName + '\'' +
                ", authorName='" + authorName + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(getNumber(), book.getNumber()) && Objects.equals(getBookName(), book.getBookName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumber(), getBookName());
    }
}
