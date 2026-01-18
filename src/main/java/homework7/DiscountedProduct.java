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
    // TODO: Заміни назву методу на printProductInfo та додай анотацію @Override.
    // Це дозволить використовувати поліморфізм (див. пояснення нижче)
    public void printDiscountedProductInfo() {
        System.out.println("Назва: " + getName());
        System.out.println("Стара ціна: " + getPrice() + " USD");
        System.out.println("Знижка: " + discount + "%");
        System.out.println("Нова ціна: " + getDiscountedPrice() + " USD");
        System.out.println("Наявність: " + (isAvailable() ? "Доступно" : "Відсутня"));
        System.out.println("----------------");
    }
}

//У твоєму коді ти створив новий метод printDiscountedProductInfo().
// Це працює, але це не гнучко.
// Якщо ти захочеш створити один спільний масив усіх товарів (і звичайних, і зі знижкою):
// Product[] allProducts = {phone, discPhone}; І запустиш цикл foreach, ти зможеш викликати лише p.printProductInfo().
//
//Як було у тебе: Для об'єктів зі знижкою викликався б батьківський метод (без інформації про знижку).
//
//Як треба: Якщо ти назвеш метод у дочірньому класі так само (printProductInfo) і додаш @Override,
// то Java автоматично "підмінить" метод батька на метод сина,
// навіть якщо об'єкт лежить у масиві типу Product. Це суть поліморфізму