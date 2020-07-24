package ptr.workshop;

public class Screw{
    private String name;
    private HeadType headType;
    private double screwLength;
    private double screwDiameter;

    public Screw(String name, HeadType headType, double screwLength, double screwDiameter) throws Exception {
        this.name = name;
        this.headType = headType;
        if (screwLength<=0) throw new WrongInputException();
        this.screwLength = screwLength;
        if (screwDiameter<=0) throw new WrongInputException();
        this.screwDiameter = screwDiameter;
    }

    public String getName() {
        return name;
    }

    public HeadType getHeadType() {
        return headType;
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
