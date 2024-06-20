class Truck extends Vehicle {
    public Truck(String licencePlate, int size) {
        super("Truck", licencePlate, size);
    }

    @Override
    public int calculateTicketPrice() {
        return getSize() * 10;
    }
}
