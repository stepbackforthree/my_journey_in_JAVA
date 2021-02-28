package Basic.customerinfomanage;

import java.util.ArrayList;

public class CustomerList {
    ArrayList<Customer> customers;
    int total;

    public CustomerList(int totalCustomer) {
        customers = new ArrayList<>();
        total = totalCustomer;
    }

    public boolean addCustomer(Customer customer) {
        if (customers.size() == total) {
            return false;
        }
        customers.add(customer);
        return true;
    }

    public boolean replaceCustomer(int index, Customer customer) {
        if (index < 0 || index > customers.size() - 1) {
            return false;
        }
        customers.set(index, customer);
        return true;
    }

    public boolean deleteCustomer(int index) {
        if (index < 0 || index > customers.size() - 1) {
            return false;
        }
        customers.remove(index);
        return true;
    }

    public ArrayList<Customer> getAllCustomers() {
        return customers;
    }

    public Customer getCustomer(int index) {
        return customers.get(index);
    }
}

