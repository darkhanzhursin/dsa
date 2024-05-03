package patterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;

/*
- use the Prototype Pattern when your code shouldn't depend on the concrete classes of the objects that
you need to copy or duplicate
- will clone objects without coupling them to their concrete classes - will get rid of repeated
initialization code
- will save resources and time
* */
public class Main {
    public static void main(String[] args) {
        List<Vehicle> vehicles = List.of(
                new Car("Toyota", "Camry", "black", 300),
                new Bus("Honda", "Accord", "white", 4)
        );
        List<Vehicle> copyList = new ArrayList<>();
        for (Vehicle vehicle : vehicles) {
            copyList.add(vehicle.clone());
        }

        copyList.forEach(System.out::println);

        System.out.println("===========================================");

        VehicleCache registry = new VehicleCache();
        registry.put(vehicles);
        System.out.println(registry.get("Toyota Camry"));
    }
}
