public class ServiceLog {
    private String date;
    private String type; 
    private String description;

    public ServiceLog(String date, String type, String description) {
        this.date = date;
        this.type = type;
        this.description = description;
    }

    @Override
    public String toString() {
        return "[" + date + "] " + type.toUpperCase() + ": " + description;
    }
}