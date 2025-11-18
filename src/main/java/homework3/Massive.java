package homework3;

public class Massive {

    public static void main(String[] args) {

        int[] nums = {-6, 662, 20, 92};
        int index = linearSearch(nums, 20);

        System.out.println("Index: " + index);
    }

    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }
}

