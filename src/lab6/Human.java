package lab6;

public abstract class Human implements IPassKey{
    private String name;
    private String surname;

    public Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    protected abstract void getInfo();

    public String getPassKey(){

        return CODE;

    }

}
