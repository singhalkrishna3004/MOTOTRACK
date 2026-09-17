import java.util.ArrayList;
import java.util.List;

public class GarageManager {
    private List<Vehicle> vehicles;

    public GarageManager() {
        this.vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle v) {
        vehicles.add(v);
        System.out.println(">> Vehicle added successfully to your garage!");
    }

    public void displayVehicles() {
        if (vehicles.isEmpty()) {
            System.out.println(">> Your garage is currently empty.");
            return;
        }
        System.out.println("\n=== Your Garage ===");
        for (Vehicle v : vehicles) {
            System.out.println("- " + v.getDetails());
        }
    }

    public Vehicle getVehicleById(String id) {
        for (Vehicle v : vehicles) {
            if (v.getId().equalsIgnoreCase(id)) {
                return v;
            }
        }
        return null;
    }
}