/* TimeSlot.java
TimeSlot entity class
Author: Angelia Van der Westhuizen 221420649
Date: 21 June 2026
*/

package za.ac.cput.campusfacilitybooking.domain;

/**
 * Represents a booking time slot.
 */
public class TimeSlot {

    private String timeSlotId;
    private String date;
    private String startTime;
    private String endTime;

    private TimeSlot(Builder builder) {
        this.timeSlotId = builder.timeSlotId;
        this.date = builder.date;
        this.startTime = builder.startTime;
        this.endTime = builder.endTime;
    }

    public String getTimeSlotId() {
        return timeSlotId;
    }

    public String getDate() {
        return date;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    @Override
    public String toString() {
        return "TimeSlot{" +
                "timeSlotId='" + timeSlotId + '\'' +
                ", date='" + date + '\'' +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                '}';
    }

    public static class Builder {
        private String timeSlotId;
        private String date;
        private String startTime;
        private String endTime;

        public Builder setTimeSlotId(String timeSlotId) {
            this.timeSlotId = timeSlotId;
            return this;
        }

        public Builder setDate(String date) {
            this.date = date;
            return this;
        }

        public Builder setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        public Builder setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        public TimeSlot build() {
            return new TimeSlot(this);
        }
    }
}