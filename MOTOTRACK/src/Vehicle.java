public class Vehicle {
    private String id;
    private String make;
    private String model;
    private int year;

    public Vehicle(String id, String make, String model, int year) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getId() { 
        return id; 
    }
    
    public String getDetails() {
        return year + " " + make + " " + model + " (ID: " + id + ")";
    }
}