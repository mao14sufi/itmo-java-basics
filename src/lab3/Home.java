package lab3;


import java.util.Calendar;

public class Home {
    private int numberFloors;
    private int yearConstruction;
    private String name;

    public void setAll(int numberFloors, int yearConstruction, String name) {
        this.numberFloors = numberFloors;
        this.yearConstruction = yearConstruction;
        this.name = name;
    }

    public int getNumberYears() {
        Calendar rightNow = Calendar.getInstance();
        int currentYear = rightNow.get(Calendar.YEAR);
        return currentYear - this.yearConstruction;
    }

    @Override
    public String toString() {
        return "Home{" +
                "numberFloors=" + numberFloors +
                ", yearConstruction=" + yearConstruction +
                ", name='" + name + '\'' +
                '}';
    }
}
