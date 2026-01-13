package homework7;

public class Customer extends User {
    public Customer(String name) {
        super(name);
    }

    @Override
    public String getRole() {
        return "Customer";
    }
}