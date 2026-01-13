package homework7;


public class DiscountedProduct extends Product {
    private double discount;

    public DiscountedProduct(String name, double price, boolean isAvailable, double discount) {
        super(name, price, isAvailable);
        this.discount = discount;
    }

    public double getDiscountedPrice() {
        return getPrice() * (1 - discount / 100);

    }

    public void printDiscountedProductInfo() {
        System.out.println("Назва: " + getName());
        System.out.println("Стара ціна: " + getPrice() + " USD");
        System.out.println("Знижка: " + discount + "%");
        System.out.println("Нова ціна: " + getDiscountedPrice() + " USD");
        System.out.println("Наявність: " + (isAvailable() ? "Доступно" : "Відсутня"));
        System.out.println("----------------");
    }
}

