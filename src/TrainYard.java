import java.util.Scanner;

public class TrainYard {
    Train[] trains = new Train[5];
    Scanner scanner = new Scanner(System.in);

    Train train1 = new Train("Gothenburg", "Stockholm");
    Train train2 = new Train("Gothenburg", "Copenhagen");
    Train train3 = new Train("Gothenburg", "Hamburg");
    Train train4 = new Train();

    public TrainYard() {

        trains[0] = train1;
        trains[1] = train2;
        trains[2] = train3;
        trains[3] = train4;
    }

    public void Bookings() {
        boolean quitting = false;
        while (!quitting) {

            System.out.println("What do you want to do?");
            System.out.println("1: Display all departures.");
            System.out.println("2. Add a departure.");
            System.out.println("5: Quit.");

            String input = scanner.nextLine();

            if (input.equals("1")) {
                Timetable();
            } else if (input.equals("2")) {
                addTrain();
            } else if (input.equals("5")) {
                quitting = true;
            } else {
                System.out.println("Invalid input.");
            }

            while (!quitting) {
                System.out.println("1. To book the train to Stockholm.");
                System.out.println("2. To book the train to Copenhagen.");
                System.out.println("3. To book the train to Hamburg.");
                if (train4.getDestination() == null) {
                    System.out.println("");
                } else {
                    System.out.println("4. To book the train to " + trains[3].getDestination());
                }
                System.out.println("5. Quit");

                String input2 = scanner.nextLine();

                try {

                    switch (input2) {

                        case "1":
                            Customer customer = Customer.addCustomer();
                            System.out.print(customer.getName() + " booked the ticket for " + trains[0].getDestination() + ", safe travels!");
                            if (customer instanceof VIPCustomer) {
                                VIPCustomer vipCustomer = (VIPCustomer) customer;
                                vipCustomer.addVip();
                            } else {
                                System.out.println("");
                            }
                            return;

                        case "2":
                            Customer customer1 = Customer.addCustomer();
                            System.out.print(customer1.getName() + " booked the ticket for " + trains[1].getDestination() + ", safe travels!");
                            if (customer1 instanceof VIPCustomer) {
                                VIPCustomer vipCustomer = (VIPCustomer) customer1;
                                vipCustomer.addVip();
                            } else {
                                System.out.println("");
                            }
                            return;

                        case "3":
                            Customer customer2 = Customer.addCustomer();
                            System.out.print(customer2.getName() + " booked the ticket for " + trains[2].getDestination() + ", safe travels!");
                            if (customer2 instanceof VIPCustomer) {
                                VIPCustomer vipCustomer = (VIPCustomer) customer2;
                                vipCustomer.addVip();
                            } else {
                                System.out.println("");
                            }
                            return;

                        case "4":
                            Customer customer3 = Customer.addCustomer();
                            System.out.print(customer3.getName() + " booked the ticket for " + trains[3].getDestination() + ", safe travels!");
                            if (customer3 instanceof VIPCustomer) {
                                VIPCustomer vipCustomer = (VIPCustomer) customer3;
                                vipCustomer.addVip();
                            } else {
                                System.out.println("");
                            }
                            return;

                        case "5":
                            quitting = true;
                        default:
                            break;
                    }
                } catch (NullPointerException e) {
                    System.out.println("Let's try again.");
                }
            }
        }
    }

    public void Timetable() {
        for (int i = 0; i < trains.length; i++) {
            if (trains[i] != null) {
                Train train = trains[i];
                System.out.println("Train " + i + " departs from " + train.getLocation() + " and arrives in " + train.getDestination());
                if (train3.getDestination().isEmpty()) {
                    System.out.print("");
                }
            }
        }
    }

    public void addTrain() {
        System.out.println("Where are we departing from?");
        String departure = scanner.nextLine();
        train4.setLocation(departure);
        System.out.println("What is the destination?");
        String destination = scanner.nextLine();
        train4.setDestination(destination);
    }
}
