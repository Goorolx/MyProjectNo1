package ptr.workshop;

import java.util.ArrayList;
import java.util.HashMap;

public class Workshop {

    private String workshopName;
    private ArrayList<ScrewType> myScrews;
    private ArrayList<ScrewDriver> myScrewDrivers;
    private HashMap<String, Integer> location;

    public Workshop(String name){
        this.workshopName = name;
    }

    public Workshop(String workshopName, ArrayList<ScrewType> myScrews,
                    ArrayList<ScrewDriver> myScrewDrivers, HashMap<String, Integer> location) {
        this.workshopName = workshopName;
        this.myScrews = myScrews;
        this.myScrewDrivers = myScrewDrivers;
        this.location = location;
    }
    //getters


    public String getWorkshopName() {
        return workshopName;
    }

    public ArrayList<ScrewType> getMyScrews() {
        return myScrews;
    }

    public ArrayList<ScrewDriver> getMyScrewDrivers() {
        return myScrewDrivers;
    }

    public HashMap<String, Integer> getLocation() {
        return location;
    }

    //setters

    public void setMyScrews(ArrayList<ScrewType> myScrews) {
        this.myScrews = myScrews;
    }

    public void setMyScrewDrivers(ArrayList<ScrewDriver> myScrewDrivers) {
        this.myScrewDrivers = myScrewDrivers;
    }

    public void setLocation(HashMap<String, Integer> location) {
        this.location = location;

    }
}
