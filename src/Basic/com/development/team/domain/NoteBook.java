package Basic.com.development.team.domain;

public class NoteBook implements Equipment {
    private String model;
    private double price;

    public NoteBook(String model, String price) {
        this.model = model;
        this.price = Double.parseDouble(price);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String getDescription() {
        return model + "(" + price + ")";
    }
}
