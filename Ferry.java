import java.util.ArrayList;

class Ferry {
    private ArrayList<Vehicle> vehiclesOnBoard;
    private int maxCapacity;
    private int currentCapacity;

    public Ferry() {
        this.currentCapacity = 0;
        this.maxCapacity = 50;
        this.vehiclesOnBoard = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        if (currentCapacity + vehicle.getSize() < maxCapacity) {
            vehiclesOnBoard.add(vehicle);
            System.out.println("Vehicle added successfully.");
            currentCapacity += vehicle.getSize();
        } else {
            System.out.println("Ferry area is full. Printing list of vehicles: ");
            printListOfVehicles();
            System.exit(0);
        }
    }

    public void printListOfVehicles() {
        for (Vehicle x : vehiclesOnBoard) {
            System.out.println("Vehicle type: " + x.getType());
            System.out.println("License Plate: " + x.getLicencePlate());
            System.out.println("Ticket Price: " + x.calculateTicketPrice());
            System.out.println("-------------------------------------------------");
        }
    }
}
