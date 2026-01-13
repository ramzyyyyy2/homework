package homework7;

public class Main {
    public static void main(String[] args) {

        Product keyboard = new Product("HyperX", 85.5, true);
        Product phone = new Product("Nokia", 475, false);
        Product laptop = new Product("Acer", 555, true);

        Product[] products = {keyboard, phone, laptop};

        for (Product p : products) {
            p.printProductInfo();
        }

        DiscountedProduct discKeyboard = new DiscountedProduct("HyperX", 85.5, true, 10);
        DiscountedProduct diskPhone = new DiscountedProduct("Nokia", 475, false, 50);
        DiscountedProduct diskLaptop = new DiscountedProduct("Acer", 555, true, 12.5);

        DiscountedProduct[] discProducts = {discKeyboard, diskPhone, diskLaptop};

        for (DiscountedProduct d : discProducts) {
            d.printDiscountedProductInfo();
        }

        User admin = new Admin("Pavlo");
        User customer = new Customer("Olena");

        admin.printUserInfo();
        customer.printUserInfo();

        User[] users = {admin, customer};

        for (User user : users) {
            if (user instanceof Admin) {
                System.out.println(user.getName() + " має права адміністратора");
            } else if (user instanceof Customer) {
                System.out.println(user.getName() + " є покупцем");
            }
        }



    }
}




