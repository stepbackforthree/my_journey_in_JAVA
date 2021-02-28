package Basic.CircleAreaCalculation;

import java.text.DecimalFormat;

class Circle {
    double radius;

    public String AreaCalculation() {
        DecimalFormat df = new DecimalFormat("#.000");
        return df.format(Math.PI * this.radius * this.radius);
    }
}

public class CircleAreaCalculation {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.radius = 3.5;
        System.out.println("The area of circle is: " + c.AreaCalculation());
    }
}
