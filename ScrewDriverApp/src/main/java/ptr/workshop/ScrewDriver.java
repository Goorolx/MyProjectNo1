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


}
