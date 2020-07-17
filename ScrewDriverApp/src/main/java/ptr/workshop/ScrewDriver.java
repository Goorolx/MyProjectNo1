package ptr.workshop;

import java.time.LocalDate;

public class ScrewDriver {
    private String name;
    private HeadType headType;
    private double driverLength;
    private double driverDiameter;
    private LocalDate dateOfPurchase;
    private LocalDate dateOfManufacture;
    private int daysInUsage=0;
    private boolean isGood=true;
    private String comment;

    public ScrewDriver(String name, HeadType headType, double driverLength, double driverDiameter,
                       LocalDate dateOfPurchase, LocalDate dateOfManufacture) {
        this.name = name;
        this.headType = headType;
        this.driverLength = driverLength;
        this.driverDiameter = driverDiameter;
        this.dateOfPurchase = dateOfPurchase;
        this.dateOfManufacture = dateOfManufacture;
    }

    public String checkScrewFit(double mils){
        if (mils==2.5)
            return "0-1";
        if (mils==3)
            return "2-4";
        if (mils==3.5)
            return "5-9";
        if (mils==5)
            return "10-16";
        if (mils==6)
            return "18-24";
        if (mils==8)
            return "5/8 & 3/4";
        else
            return "Not valid Phillips tip size: please provide 2.5, 3, 3.5, 5, 6, 8";
    }

    public void useScrewDriverDay(int days){
        int d = getDaysInUsage() + days;
        setDaysInUsage(d);
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

    public HeadType getHeadType() {
        return headType;
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
