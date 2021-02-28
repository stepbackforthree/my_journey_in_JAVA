package extend.exercise;

import java.text.DecimalFormat;

class Circle {
    private double radius;

    public Circle() {
        radius = 1;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double findArea() {
        return radius * radius * Math.PI;
    }

    public double findVolume() {
        return 0;
    }
}

class Cylinder extends Circle {
    private double length;

    public Cylinder() {
        length = 1;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double findVolume() {
        return findArea() * getLength();
    }
}

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder a = new Cylinder();
        DecimalFormat df = new DecimalFormat("#.000");
        a.setLength(5.3);
        a.setRadius(2.4);
        System.out.println(df.format(a.findArea()));
        System.out.println(a.findVolume());
    }
}
