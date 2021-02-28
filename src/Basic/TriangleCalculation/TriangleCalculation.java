package TriangleCalculation;

class Triangle {
    private int base;
    private int height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    public void  findArea() {
        System.out.println("The area of this triangle is: " + base * height / 2);
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setBase(int base) {
        this.base = base;
    }
}

public class TriangleCalculation {
    public static void main(String[] args) {
        Triangle t = new Triangle(5, 5);
        t.setHeight(10);
        t.setBase(10);
        t.findArea();
    }
}
