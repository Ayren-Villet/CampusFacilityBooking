package za.ac.cput.campusfacilitybooking.domain;


import za.ac.cput.campusfacilitybooking.domain.enums.MaintenancePriority;
import za.ac.cput.campusfacilitybooking.domain.enums.MaintenanceStatus;
import za.ac.cput.campusfacilitybooking.domain.Equipment;
import java.time.LocalDate;
import java.util.Objects;

public class MaintenanceRequest {

    private final String requestId;
    private final Equipment equipment;
    private final String reportedById;
    private final String description;
    private final MaintenancePriority priority;
    private final MaintenanceStatus status;
    private final LocalDate dateReported;

    private MaintenanceRequest(Builder builder) {
        this.requestId = builder.requestId;
        this.equipment = builder.equipment;
        this.reportedById = builder.reportedById;
        this.description = builder.description;
        this.priority = builder.priority;
        this.status = builder.status;
        this.dateReported = builder.dateReported;
    }

    public static class Builder {
        private String requestId;
        private Equipment equipment;
        private String reportedById;
        private String description;
        private MaintenancePriority priority = MaintenancePriority.MEDIUM;
        private MaintenanceStatus status = MaintenanceStatus.OPEN;
        private LocalDate dateReported;

        public Builder requestId(String requestId) { 
            this.requestId = requestId; 
            return this; }
        public Builder equipment(Equipment equipment) { 
            this.equipment = equipment; 
            return this; }
        public Builder reportedById(String reportedById) { 
            this.reportedById = reportedById; 
            return this; }
        public Builder description(String description) { 
            this.description = description; 
            return this; }
        public Builder priority(MaintenancePriority priority) { 
            this.priority = priority; 
            return this; }
        public Builder status(MaintenanceStatus status) { 
            this.status = status; 
            return this; }
        public Builder dateReported(LocalDate dateReported) { 
            this.dateReported = dateReported; 
            return this; }

        public MaintenanceRequest build() {
            Objects.requireNonNull(requestId, "requestId is required");
            Objects.requireNonNull(equipment, "equipment is required");
            Objects.requireNonNull(reportedById, "reportedById is required");
            Objects.requireNonNull(description, "description is required");
            return new MaintenanceRequest(this);
        }
    }

    public String getRequestId() { 
        return requestId; }
    public Equipment getEquipment() { 
        return equipment; }
    public String getReportedById() { 
        return reportedById; }
    public String getDescription() { 
        return description; }
    public MaintenancePriority getPriority() { 
        return priority; }
    public MaintenanceStatus getStatus() { 
        return status; }
    public LocalDate getDateReported() { 
        return dateReported; }

    @Override
    public String toString() {
        return String.format("MaintenanceRequest(requestId=%s, equipment=%s, priority=%s, status=%s)", requestId, equipment, priority, status);
    }
}
