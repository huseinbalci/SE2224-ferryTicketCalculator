class Car extends Vehicle {
    public Car (String licencePlate, int size) {
        super("Car", licencePlate, size);
    }

    @Override
    public int calculateTicketPrice() {
        return getSize() * 5;
    }
}
