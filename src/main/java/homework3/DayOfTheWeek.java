package homework3;

import java.util.Scanner;

public class DayOfTheWeek {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Будь ласочка, оберіть день, коли Ви хочете завітати:)");
        String day = sc.nextLine().toLowerCase();
        switch (day) {
            case "понеділок", "вівторок", "середа", "четвер", "п'ятниця":
                System.out.println("Робочий день");
                break;
            case "субота", "неділя":
                System.out.println("Вихідний день");
                break;
            default:
                System.out.println("Невідомий день");
        }


    }

}