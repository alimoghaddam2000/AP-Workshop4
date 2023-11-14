package HW4.Q1;

public class Car extends Vehicle {
    private String model;
    private String fuelType;

    public Car(String name, int year, String color, String model, String fuelType) {
        super(name, year, color);
        this.model = model;
        this.fuelType = fuelType;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Fuel Type of Vehicle: " + this.fuelType);
        System.out.println("Model of Vehicle: " + this.model);
    }

    public void startEngine() {
        System.out.println("Car Engine Start!");
    }
}
