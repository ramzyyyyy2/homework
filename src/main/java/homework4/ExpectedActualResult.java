package homework4;

public class ExpectedActualResult {
    public static void main(String[] args) {
        String expected = ("Login succesfull");
        String actual = ("Login succesfull");
        if (expected.equals(actual)) {
            System.out.println("✅ Тест пройдено!");
        } else {
            System.out.println("❌ Тест не пройдено!");
            System.out.println("Очікувалось: " + expected);
            System.out.println("Отримано: " + actual);
        }
    }

}