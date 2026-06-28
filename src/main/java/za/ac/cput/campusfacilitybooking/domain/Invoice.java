package za.ac.cput.campusfacilitybooking.domain;

import java.time.LocalDate;

public class Invoice {

    private String invoiceId;
    private Booking booking;
    private double amount;
    private LocalDate issueDate;
    private LocalDate dueDate;
    private boolean paid;

    // Default Constructor
    public Invoice() {
    }

    // Parameterized Constructor
    public Invoice(String invoiceId, Booking booking, double amount,
                   LocalDate issueDate, LocalDate dueDate, boolean paid) {

        this.invoiceId = invoiceId;
        this.booking = booking;
        this.amount = amount;
        this.issueDate = issueDate;
        this.dueDate = dueDate;
        this.paid = paid;
    }

    // Getters and Setters
    public String getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "invoiceId='" + invoiceId + '\'' +
                ", booking=" + booking +
                ", amount=" + amount +
                ", issueDate=" + issueDate +
                ", dueDate=" + dueDate +
                ", paid=" + paid +
                '}';
    }
}