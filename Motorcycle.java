package HW4.Q1;

/**
 * Motorcycle
 */
public class Motorcycle extends Vehicle {

    private int EnginSize;
    private int topSpeed;

    public Motorcycle(String name, int year, String color, int EnginSize, int topSpeed) {
        super(name, year, color);
        this.topSpeed = topSpeed;
        this.EnginSize = EnginSize;
    }

    public int getEnginSize() {
        return EnginSize;
    }

    public void setEnginSize(int enginSize) {
        EnginSize = enginSize;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Engin Size is :" + this.EnginSize);
        System.out.println("Top Speed is :" + this.topSpeed);
    }

    public void wheelie() {
        System.out.println("Motorcycle Performs a Wheelie.");
    }
}