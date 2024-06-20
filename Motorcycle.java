class Motorcycle extends Vehicle {
    public Motorcycle(String licencePlate, int size) {
        super("Motorcycle", licencePlate, size);
    }

    @Override
    public int calculateTicketPrice() {
        return getSize() * 2;
    }
}
