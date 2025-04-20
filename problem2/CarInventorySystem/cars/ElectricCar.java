package problem2.CarInventorySystem.cars;

public class ElectricCar extends Car {

    public ElectricCar(String brand, String model, int year) {
        super(brand, model, year);
    }

    @Override
    public void start() {
        System.out.println("Electric car " + getDetails() + " is silently starting...");
    }

    @Override
    public void stop() {
        System.out.println("Electric car " + getDetails() + " is powering down.");
    }
}
