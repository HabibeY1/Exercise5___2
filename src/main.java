import java.util.Arrays;
import java.util.Random;

public class main {
    public static void main(String[] args) {
        int min = 100;
        int max = 0;
        Random r = new Random();

        int[] nums = new int[10];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = r.nextInt(100) + 1;
            System.out.print(nums[i] + ", ");


            if (nums[i] < min) {
                min = nums[i];
            }
            if (nums[i] > max) {
                max = nums[i];
            }
        }

        System.out.println();
        System.out.println("The smallest value is: " + min);
        System.out.println("The greatest value is: " + max);
    }
}
