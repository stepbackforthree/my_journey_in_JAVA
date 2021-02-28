package Basic.customerinfomanage;

public class CustomerInfoManage {
    CustomerList customerList = new CustomerList(2);
    public void enterMainMenu() {
        while (true) {
            MainInterface.mainInterface();
            char input = KeyboardInput.readMenuSelection();
            if (input == '1') {
                addNewCustomer();
            } else if (input == '2') {
                editCustomer();
            } else if (input == '3') {
                deleteCustomer();
            } else if (input == '4') {
                showCustomerList();
            } else {
                System.out.println("----------------Thanks for using, goodbye!----------------");
                break;
            }
        }
    }

    private void addNewCustomer() {
        System.out.println("----------------Add Customer----------------");
        System.out.print("\t\t\tName: ");
        String name = KeyboardInput.readString(20);
        System.out.print("\t\t\tSex: ");
        char sex = KeyboardInput.readChar();
        System.out.print("\t\t\tAge: ");
        int age = KeyboardInput.readInt();
        System.out.print("\t\t\tPhone: ");
        String phone = KeyboardInput.readString(20);
        System.out.print("\t\t\tEmail: ");
        String email = KeyboardInput.readString(50);
        Customer customer = new Customer(name, sex, age, phone, email);
        if (customerList.addCustomer(customer)) {
            System.out.println("----------------Add Completed----------------");
        } else {
            System.out.println("----------------Capacity full, add failed----------------");
        }
    }

    private void editCustomer() {
        System.out.println("----------------Edit Customer----------------");
        System.out.print("\t\t\tPlease select the number of customer(-1 exit): ");
        int index = KeyboardInput.readInt();
        if (index > customerList.getAllCustomers().size()) {
            System.out.println("----------------Index out of range, edit failed----------------");
        } else if (index != -1){
            System.out.print("\n\t\t\tName: ");
            String name = KeyboardInput.readString(20, customerList.getCustomer(index - 1).getName());
            System.out.print("\n\t\t\tSex: ");
            char sex = KeyboardInput.readChar(customerList.getCustomer(index - 1).getSex());
            System.out.print("\n\t\t\tAge: ");
            int age = KeyboardInput.readInt(customerList.getCustomer(index - 1).getAge());
            System.out.print("\n\t\t\tPhone: ");
            String phone = KeyboardInput.readString(20, customerList.getCustomer(index - 1).getPhone());
            System.out.print("\n\t\t\tEmail: ");
            String email = KeyboardInput.readString(50, customerList.getCustomer(index - 1).getEmail());
            if (customerList.replaceCustomer(index - 1, new Customer(name, sex, age, phone, email))) {
                System.out.println("----------------Edit Completed----------------");
            } else {
                System.out.println("----------------Index invalid, edit failed----------------");
            }
        }
    }

    private void deleteCustomer() {
        System.out.println("----------------Delete Customer----------------");
        System.out.print("Please select the number of customer waiting for deleting(-1 exit): ");
        int index = KeyboardInput.readInt();
        if (index > customerList.getAllCustomers().size()) {
            System.out.println("----------------Index out of range, delete failed----------------");
        } else if (index != -1) {
            System.out.print("\nPlease confirm that whether to delete(Y/N): ");
            char input = KeyboardInput.readConfirmSelection();
            if (input == 'Y') {
                if (customerList.deleteCustomer(index - 1)) {
                    System.out.println("----------------Delete Completed----------------");
                } else {
                    System.out.println("----------------Index invalid, replace failed----------------");
                }
            }
        }
    }

    private void showCustomerList() {
        if (customerList.getAllCustomers().size() == 0) {
            System.out.println("There is no customer yet.");
        } else {
            System.out.println("----------------Customer List----------------");
            System.out.println("No.\t\tName\t\tSex\t\tAge\t\tPhone\t\tEmail");
            int no = 1;
            for (Customer customer : customerList.getAllCustomers()) {
                System.out.println(no + "\t\t" + customer.getName() +
                        "\t\t" + customer.getSex() + "\t\t" +
                        customer.getAge() + "\t\t" + customer.getPhone() +
                        "\t\t" + customer.getEmail() + "\t\t");
                no++;
            }
            System.out.println("----------------Customer List Completed----------------");
        }
    }

    public static void main(String[] args) {
        CustomerInfoManage main = new CustomerInfoManage();
        main.enterMainMenu();
    }
}
