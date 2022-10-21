import java.util.Scanner;

public class Customer {

    String name;

    public Customer() {
        ;
    }

    public Customer(String name) {
        this.name = name;
    }

    public static Customer addCustomer() {
        boolean quitting = false;
        Scanner scanner = new Scanner(System.in);
        while (!quitting) {

            System.out.println("Add customer:");
            System.out.println("1. Add regular customer:");
            System.out.println("2. Add VIP:");
            System.out.println("5. Back to departure list.");

            String input3 = scanner.nextLine();

            switch (input3) {

                case "1":
                    System.out.println("Please state your name:");
                    Customer customer = new Customer(scanner.nextLine());
                    return customer;
                case "2":
                    System.out.println("Please state the VIP:");
                    String vipPassenger = "";
                    Customer vipCustomer = new VIPCustomer(scanner.nextLine(), vipPassenger);
                    return vipCustomer;
                case "5":
                    return null;
                default:
                    return null;
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}