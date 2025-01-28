package lab6;

public class Client extends Human {
    private String bankName;

    public Client(String name, String surname, String bankName) {
        super(name, surname);
        this.bankName = bankName;
    }


    @Override
    protected void getInfo() {
        System.out.println("Client " + getName() + " " + getSurname() + "/Bank " + this.bankName);
    }
}
