package Advanced.day1.Car;

import java.util.ArrayList;
import java.util.Iterator;

public class CarTest {
    public static void sale(ArrayList cars, Integer price) {
        for (Object object : cars) {
            Car car = (Car) object;
            car.setPrice(car.getPrice() - price);
        }
    }

    public static void main(String[] args) {
        ArrayList cars = new ArrayList();
        for (int i = 1; i < 10; i++) {
            cars.add(new Car(Integer.toString(i), i * 10000));
        }
        sale(cars, 5000);
        for (Object object : cars) {
            Car car = (Car) object;
            System.out.println(car.getPrice());
        }
    }
}
