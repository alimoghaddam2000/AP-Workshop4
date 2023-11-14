package HW4.Q1;

/**
 * Vehicle
 */
public class Vehicle {
    private String name;
    private String color;
    private int year;

    public Vehicle(String name, int year, String color) {
        this.name = name;
        this.year = year;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Name of Vehicle: " + this.name);
        System.out.println("Year of Release: " + this.year);
        System.out.println("Color of Vehicle: " + this.color);
    }
}