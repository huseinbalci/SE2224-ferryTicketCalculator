import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ferry ferry = new Ferry();

        System.out.println("Ferry Ticket Calculator");
        System.out.println("1.Add Vehicle");
        System.out.println("2.Exit");

        while (true) {
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.print("Enter vehicle type (motorcycle/car/truck): ");
                String t = scanner.nextLine();
                System.out.print("Enter license plate number: ");
                String lp = scanner.nextLine();
                System.out.print("Enter size: ");
                int s = scanner.nextInt();
                scanner.nextLine();

                Vehicle v;
                switch (t.toLowerCase()) {
                    case "motorcycle":
                        v = new Motorcycle(lp, s);
                        break;
                    case "car":
                        v = new Car(lp, s);
                        break;
                    case "truck":
                        v = new Truck(lp, s);
                        break;
                    default:
                        System.out.println("Invalid vehicle type. Please try again.");
                        continue;
                }
                ferry.addVehicle(v);
            } else if (choice == 2) {
                break;
            } else {
                System.out.println("Invalid choice. Please choose 1 or 2.");
            }
        }
        scanner.close();
    }
}