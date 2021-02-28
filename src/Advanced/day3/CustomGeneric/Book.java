package Advanced.day3.CustomGeneric;

public class Book {
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

    // HashSet去重：重写hashCode和equals
    @Override
    public int hashCode() {
        return this.name.hashCode() + this.price.hashCode() + this.author.hashCode();
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof Book)) {
            return false;
        }
        return this.name.equals(((Book) object).getName())
                && this.price.equals(((Book) object).getPrice())
                && this.author.equals(((Book) object).getAuthor());
    }
}
