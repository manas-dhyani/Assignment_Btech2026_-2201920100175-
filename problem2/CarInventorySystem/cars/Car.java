package problem2.CarInventorySystem.cars;


public abstract class Car {
    private String brand;
    private String model;
    private int year;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public abstract void start();
    public abstract void stop();

    public String getDetails() {
        return String.format("%s %s (%d)", brand, model, year);
    }

    public String getBrand() { return brand; }
    public String getModel() { return model; }
    public int getYear() { return year; }
}
