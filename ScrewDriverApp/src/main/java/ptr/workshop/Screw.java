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

    public void editScrew(String name, HeadType headType, double screwLength, double screwDiameter) throws Exception{
        if (name.equals(null)) throw new WrongInputException();
        else setName(name);
        setHeadType(headType);
        if (screwLength<=0) throw new WrongInputException();
        else setScrewLength(screwLength);
        if (screwDiameter<=0) throw new WrongInputException();
        else setScrewDiameter(screwDiameter);

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

    public void setHeadType(HeadType headType) {
        this.headType = headType;
    }

    public void setScrewLength(double screwLength) {
        this.screwLength = screwLength;
    }

    public void setScrewDiameter(double screwDiameter) {
        this.screwDiameter = screwDiameter;
    }
}
