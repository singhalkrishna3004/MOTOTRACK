import java.util.Scanner;

public class MotoTrack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GarageManager garage = new GarageManager();
        MaintenanceTracker tracker = new MaintenanceTracker();
        boolean running = true;

        System.out.println("=================================");
        System.out.println("    Welcome to MotoTrack CLI     ");
        System.out.println("=================================");

        while (running) {
            System.out.println("\n1. Add a New Vehicle");
            System.out.println("2. View My Garage");
            System.out.println("3. Log a Service, Repair, or Mod");
            System.out.println("4. View Vehicle History");
            System.out.println("5. Exit System");
            System.out.print("\nSelect an option (1-5): ");
            
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter a short Vehicle ID (e.g., M1, C1): ");
                    String id = scanner.nextLine();
                    System.out.print("Enter Make (e.g., Royal Enfield, Ferrari): ");
                    String make = scanner.nextLine();
                    System.out.print("Enter Model: ");
                    String model = scanner.nextLine();
                    System.out.print("Enter Year: ");
                    try {
                        int year = Integer.parseInt(scanner.nextLine());
                        garage.addVehicle(new Vehicle(id, make, model, year));
                    } catch (NumberFormatException e) {
                        System.out.println(">> Error: Year must be a valid number.");
                    }
                    break;
                case "2":
                    garage.displayVehicles();
                    break;
                case "3":
                    System.out.print("Enter the Vehicle ID: ");
                    String vId = scanner.nextLine();
                    if (garage.getVehicleById(vId) != null) {
                        System.out.print("Enter Date (DD-MM-YYYY): ");
                        String date = scanner.nextLine();
                        System.out.print("Enter Type (Repair/Mod/Maintenance): ");
                        String type = scanner.nextLine();
                        System.out.print("Enter Description (e.g., Oil change, fixing crackling sound): ");
                        String desc = scanner.nextLine();
                        tracker.addLog(vId, new ServiceLog(date, type, desc));
                    } else {
                        System.out.println(">> Vehicle ID not found in garage.");
                    }
                    break;
                case "4":
                    System.out.print("Enter Vehicle ID to view history: ");
                    String searchId = scanner.nextLine();
                    tracker.printHistory(searchId);
                    break;
                case "5":
                    running = false;
                    System.out.println("Exiting MotoTrack... Drive safe!");
                    break;
                default:
                    System.out.println(">> Invalid option. Please try again.");
            }
        }
        scanner.close();
    }
}