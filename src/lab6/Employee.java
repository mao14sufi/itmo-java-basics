package lab6;

public class Employee extends Human {
    private String bankName;

    public Employee(String name, String surname, String bankName) {
        super(name, surname);
        this.bankName = bankName;
    }

    @Override
    protected void getInfo() {
        System.out.println("Employee" + getName() + " " + getSurname() + "/ Bank " + this.bankName);

    }
}
