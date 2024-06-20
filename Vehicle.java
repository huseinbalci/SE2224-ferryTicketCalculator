abstract class Vehicle {
    private String type;
    private String licencePlate;
    private int size;

    public Vehicle(String type, String licencePlate, int size) {
        this.type = type;
        this.licencePlate = licencePlate;
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public String getLicencePlate() {
        return licencePlate;
    }

    public int getSize() {
        return size;
    }

    public abstract int calculateTicketPrice();
}
