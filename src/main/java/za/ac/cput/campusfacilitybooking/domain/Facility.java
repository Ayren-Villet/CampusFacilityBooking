package za.ac.cput.campusfacilitybooking.domain;

public class Facility {

    private String facilityId;
    private String name;
    private String type;
    private int capacity;
    private String location;
    private Department department;

    // Default Constructor
    public Facility() {
    }

    // Parameterized Constructor
    public Facility(String facilityId, String name, String type, int capacity, String location, Department department) {
        this.facilityId = facilityId;
        this.name = name;
        this.type = type;
        this.capacity = capacity;
        this.location = location;
        this.department = department;
    }

    // Getters and Setters
    public String getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(String facilityId) {
        this.facilityId = facilityId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "facilityId='" + facilityId + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", capacity=" + capacity +
                ", location='" + location + '\'' +
                ", department=" + department +
                '}';
    }
}
