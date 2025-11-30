package homework4;

import java.util.Scanner;

public class Students {
    public static void main(String[] args) {

        String[] names = new String[5];
        Scanner ur_name = new Scanner(System.in);
        for (int i = 0; i < names.length; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = ur_name.nextLine();
        }
        for (String n : names) {
            System.out.println("Name: " + n);
        }


    }
}

// TODO: (1) Назва змінної Scanner "ur_name" не відповідає Java naming conventions. Java стиль → camelCase
// TODO: (2) Немає перевірки на пустий ввід
// TODO: (3) Scanner слід закривати після використання: .close();