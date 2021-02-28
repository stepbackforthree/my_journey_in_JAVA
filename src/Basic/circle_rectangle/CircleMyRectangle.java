package circle_rectangle;

class GeometricObject {
    private String color;
    private double weight;

    public GeometricObject() {
    }

    public GeometricObject(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double findArea() {
        return 0;
    }
}

class Circle extends GeometricObject {
    private double radius;

    public Circle(double radius, String color, double weight) {
        super(color, weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double findArea() {
        return radius * radius * Math.PI;
    }
}

class MyRectangle extends GeometricObject{
    double width;
    double height;

    public MyRectangle(double width, double height, String color, double weight) {
        super(color, weight);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double findArea() {
        return width * height;
    }
}

public class CircleMyRectangle {
    public static void equalsArea(GeometricObject geometricObject1, GeometricObject geometricObject2) {
        System.out.println((geometricObject1.findArea() == geometricObject2.findArea()) ? "Equal" : "Not Equal");
    }

    public static void displayGeometricObject(GeometricObject geometricObject) {
        System.out.println("The area is " + geometricObject.findArea());
    }

    public static void main(String[] args) {
        Circle c = new Circle(5, "red", 10);
        GeometricObject r = new MyRectangle(25, Math.PI, "green", 20);
        equalsArea(c, r);
        displayGeometricObject(c);
        displayGeometricObject(r);
    }
}
