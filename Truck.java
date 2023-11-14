package HW4.Q1;

public class Truck extends Vehicle {
    private int cargoCapacity;

    public Truck(String name, int year, String color, int cargoCapacity) {
        super(name, year, color);
        this.cargoCapacity = cargoCapacity;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Cargo Capacity is :" + this.cargoCapacity);
    }

    public void loadCargo() {
        System.out.println("Truck is loading cargo");
    }
}
