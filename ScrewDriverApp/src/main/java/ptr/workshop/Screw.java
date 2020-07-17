package ptr.workshop;

public class Screw {
    private String name;
    private String screwType;
    private double screwLength;
    private double screwDiameter;

    public Screw(String name, String screwType, double screwLength, double screwDiameter) {
        this.name = name;
        this.screwType = screwType;
        this.screwLength = screwLength;
        this.screwDiameter = screwDiameter;
    }

    public String getName() {
        return name;
    }

    public String getScrewType() {
        return screwType;
    }

    public double getScrewLength() {
        return screwLength;
    }

    public double getScrewDiameter() {
        return screwDiameter;
    }

    public void setName(String name) {
        this.name = name;
    }
}
