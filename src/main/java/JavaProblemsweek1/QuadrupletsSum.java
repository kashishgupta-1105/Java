package JavaProblemsweek1;

import java.util.Arrays;
import java.util.Scanner;


//15. Given an array nums of n integers, return an array of all the unique
//quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:
//0 <= a, b, c, d < n
//a, b, c, and d are distinct.
//nums[a] + nums[b] + nums[c] + nums[d] == target

public class QuadrupletsSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();

        System.out.println("Enter array values: ");
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Enter the target: ");
        int target = sc.nextInt();

        int[][] temp = new int[n * n][4];
        int count = 0;
        Arrays.sort(nums);

        for (int i = 0; i < n - 3; i++) {
            for (int j = i + 1; j < n - 2; j++) {
                for (int k = j + 1; k < n - 1; k++) {
                    for (int l = k + 1; l < n; l++) {
                        if (nums[i] + nums[j] + nums[k] + nums[l] == target) {
                            boolean duplicate = false;
                            for (int m = 0; m < count; m++) {
                                if (Arrays.equals(temp[m], new int[]{nums[i], nums[j], nums[k], nums[l]})) {
                                    duplicate = true;
                                    break;
                                }
                            }
                            if (!duplicate) {
                                temp[count][0] = nums[i];
                                temp[count][1] = nums[j];
                                temp[count][2] = nums[k];
                                temp[count][3] = nums[l];
                                count++;
                            }
                        }
                    }
                }
            }
        }

        int[][] result = new int[count][4];
        for (int i = 0; i < count; i++) {
            result[i] = Arrays.copyOf(temp[i], 4);
        }

        System.out.println("Unique quadruplets:");
        for (int[] quad : result) {
            System.out.println(Arrays.toString(quad));
        }
    }
}
