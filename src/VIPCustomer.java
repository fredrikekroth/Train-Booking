public class VIPCustomer extends Customer {


    String vipPassenger;

    public VIPCustomer(String name, String vipPassenger) {
        super(name);
    }

    public void addVip() {
        System.out.println(" Drinking a fine glass of Chablis.");
    }

}
