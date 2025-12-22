package homework4;

import java.util.Scanner;

public class Students {
    public static void main(String[] args) {

        String[] names = new String[5];
        Scanner urName = new Scanner(System.in);
        for (int i = 0; i < names.length; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = urName.nextLine();
        }
        for (String n : names) {
            System.out.println("Name: " + n);
        }

        urName.close();
    }
}
