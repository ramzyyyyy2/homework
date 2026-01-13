package homework7;

abstract class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract String getRole();

    public void printUserInfo() {
        System.out.println(getName() + " - " + getRole());
    }

}
