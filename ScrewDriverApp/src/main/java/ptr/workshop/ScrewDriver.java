package ptr.workshop;

import java.time.LocalDate;

public class ScrewDriver {
    private String name;
    private ScrewType screwType;
    private double driverLength;
    private double driverDiameter;
    private LocalDate dateOfPurchase;
    private LocalDate dateOfManufacture;
    private int daysInUsage;
    private boolean isGood;
    private String comment;

    public ScrewDriver(String name, ScrewType screwType, double driverLength, double driverDiameter,
                       LocalDate dateOfPurchase, LocalDate dateOfManufacture) {
        this.name = name;
        this.screwType = screwType;
        this.driverLength = driverLength;
        this.driverDiameter = driverDiameter;
        this.dateOfPurchase = dateOfPurchase;
        this.dateOfManufacture = dateOfManufacture;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setDaysInUsage(int daysInUsage) {
        this.daysInUsage = daysInUsage;
    }

    public void setGood(boolean good) {
        isGood = good;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getName() {
        return name;
    }

    public ScrewType getScrewType() {
        return screwType;
    }

    public double getDriverLength() {
        return driverLength;
    }

    public double getDriverDiameter() {
        return driverDiameter;
    }

    public LocalDate getDateOfPurchase() {
        return dateOfPurchase;
    }

    public LocalDate getDateOfManufacture() {
        return dateOfManufacture;
    }

    public int getDaysInUsage() {
        return daysInUsage;
    }

    public boolean isGood() {
        return isGood;
    }

    public String getComment() {
        return comment;
    }
}
