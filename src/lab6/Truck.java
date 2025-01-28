package lab6;

public class Truck extends Car{
    private int numOfWheels;
    private double maxWeight;

    public Truck(int w, String m, char c, float s, double maxWeight, int numOfWheels) {
        super(w, m, c, s);
        this.maxWeight = maxWeight;
        this.numOfWheels = numOfWheels;
    }

    public void newWheels(int numOfWheels){
        this.numOfWheels = numOfWheels;
        System.out.println("Number of wheels : " + this.numOfWheels);


    }
}
