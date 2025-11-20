package homework3;

import java.util.Scanner;

public class Massive {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        int index = -1;
        int[] nums = {-6, 662, 20, 92};
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == n) {
                index = i;
                break;
            }
        }
        System.out.println(index);
    }


}
