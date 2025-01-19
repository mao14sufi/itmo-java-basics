package lab2;

public class Planet {
    private String name;
    private long population;
    private double mass;
    public Planet() {
    }
    public Planet( String name, long population, double mass ) {
        this.name = name;
        this.population = population;
        this.mass =mass;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public long getPopulation() {
        return population;
    }
    public void setPopulation(long population) {
        this.population = population;
    }
    public double getMass() {
        return mass;
    }
    public void setMass(double mass) {
        this.mass = mass;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", population=" + population +
                ", mass=" + mass +
                '}';
    }


}