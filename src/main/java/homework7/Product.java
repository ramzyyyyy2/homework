package homework7;

public class Product {

    private String name;
    private double price;
    private boolean isAvailable;

    public Product(String name, double price, boolean isAvailable) {
        this.setName(name);
        this.setPrice(price);
        this.setAvailable(isAvailable);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Перевірте ім'я!");
        }
    }

    public double getPrice() {
        return price;

    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Ціна не може бути від'ємною!");
        }

    }

    public boolean isAvailable() {
        return isAvailable;
    }


    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
    public void printProductInfo (){
        System.out.println("Назва: " + getName());
        System.out.println("Ціна: " + getPrice() + " USD");
        System.out.println("Наявність " + (isAvailable() ? "Доступно" : "Відсутня"));
        System.out.println("----------------");
    }
}


