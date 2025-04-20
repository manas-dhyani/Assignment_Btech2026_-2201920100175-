package problem2.CarInventorySystem.inventory;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import problem2.CarInventorySystem.cars.Car;

public class CarInventory {
    private List<Car> cars;

    public CarInventory() {
        cars = new ArrayList<>();
    }

    public void addCar(Car car) {
        cars.add(car);
        System.out.println("Added to inventory: " + car.getDetails());
    }

    public void removeCar(Car car) {
        cars.remove(car);
        System.out.println("Removed from inventory: " + car.getDetails());
    }

    public List<Car> getAllCars() {
        return cars;
    }

    public List<Car> getCarsByBrand(String brand) {
        return cars.stream()
                   .filter(c -> c.getBrand().equalsIgnoreCase(brand))
                   .collect(Collectors.toList());
    }

    public void listInventory() {
        System.out.println("Current Inventory:");
        for (Car car : cars) {
            System.out.println("- " + car.getDetails());
        }
    }
}
