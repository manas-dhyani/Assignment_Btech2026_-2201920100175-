package problem2.CarInventorySystem.cars;

public class GasCar extends Car {

    public GasCar(String brand, String model, int year) {
        super(brand, model, year);
    }

    @Override
    public void start() {
        System.out.println("Gas car " + getDetails() + " is starting with a roar.");
    }

    @Override
    public void stop() {
        System.out.println("Gas car " + getDetails() + " is shutting off the engine.");
    }
}
