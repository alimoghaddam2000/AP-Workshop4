package HW4.Q1;

/**
 * Bicycle
 */
public class Bicycle extends Vehicle {

    private int numberOfGear;
    private boolean isElectric;

    public Bicycle(String name, int year, String color, int numberOfGear, boolean isElectric) {
        super(name, year, color);
        this.numberOfGear = numberOfGear;
        this.isElectric = isElectric;
    }

    public int getNumberOfGear() {
        return numberOfGear;
    }

    public void setNumberOfGear(int numberOfGear) {
        this.numberOfGear = numberOfGear;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean isElectric) {
        this.isElectric = isElectric;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Gear: " + this.numberOfGear);
        System.out.println("Is Bicycle Electrick: " + (this.isElectric ? "Yes" : "No"));
    }

    public void ringBell() {
        System.out.println("Bicycle Bell Rings!");
    }
}