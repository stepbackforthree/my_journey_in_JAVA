package Advanced.day6.ProductorandCustomer;

public class ProductorandCustomerTest {
    public static void main(String[] args) {
        Clerk clerk = new Clerk(0);
//        Productor productor = new Productor(clerk);
//        Customer customer = new Customer(clerk);
//        productor.start();
//        customer.start();
        Productor productor1 = new Productor(clerk);
        productor1.start();
        Productor productor2 = new Productor(clerk);
        productor2.start();
        Productor productor3 = new Productor(clerk);
        productor3.start();
        Customer customer1 = new Customer(clerk);
        customer1.start();
        Customer customer2 = new Customer(clerk);
        customer2.start();

    }
}
