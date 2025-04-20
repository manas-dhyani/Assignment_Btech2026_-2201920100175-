package problem2.CarInventorySystem;


import problem2.CarInventorySystem.cars.*;
import problem2.CarInventorySystem.inventory.CarInventory;

public class Main {
    public static void main(String[] args) {
        CarInventory inventory = new CarInventory();

        Car tesla = new ElectricCar("Tesla", "Model 3", 2023);
        Car ford = new GasCar("Ford", "Mustang", 2022);
        Car nissan = new ElectricCar("Nissan", "Leaf", 2021);

        inventory.addCar(tesla);
        inventory.addCar(ford);
        inventory.addCar(nissan);

        inventory.listInventory();

        System.out.println("\nStarting all cars:");
        for (Car car : inventory.getAllCars()) {
            car.start();
        }

        System.out.println("\nStopping all cars:");
        for (Car car : inventory.getAllCars()) {
            car.stop();
        }
    }
}
