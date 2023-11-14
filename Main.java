package HW4.Q1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("Benz", 2020, "Yellow", "C200", "Gasoil"));
        vehicles.add(new Bicycle("bicyle1", 2012, "Red", 5, true));
        vehicles.add(new Motorcycle("Honda", 2000, "Blue", 100, 200));
        vehicles.add(new Truck("Neisan", 1999, "SkyBlue", 200000));
        for (Vehicle vehicle : vehicles) {
            vehicle.displayInfo();
            if (vehicle instanceof Car) {
                ((Car) vehicle).startEngine();
            }
            if (vehicle instanceof Motorcycle) {
                ((Motorcycle) vehicle).wheelie();
            }
            if (vehicle instanceof Truck) {
                ((Truck) vehicle).loadCargo();
            }
            if (vehicle instanceof Bicycle) {
                ((Bicycle) vehicle).ringBell();
            }
        }
    }
}