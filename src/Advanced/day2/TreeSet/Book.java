package Advanced.day2.TreeSet;

public class Book implements Comparable {
    private String name;
    private Double price;
    private String author;

    public Book(String name, Double price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "名称：" + name + " 价格：" + price + " 作者：" + author;
    }

    // TreeSet自然排序时需要对要排序的类实现Comparable接口，并重写compareTo()方法
    @Override
    public int compareTo(Object o) {
        return (int) (this.price - ((Book) o).getPrice());
    }
}
