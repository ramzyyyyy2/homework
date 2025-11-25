package homework3;


import java.util.Scanner;

public class Age {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть свій вік: ");
        int ageChecker = scanner.nextInt();
        if (ageChecker >= 18) {
            System.out.println("Вхід дозволено");
        } else {
            System.out.println("Вхід заборонено");
        }


    }
}