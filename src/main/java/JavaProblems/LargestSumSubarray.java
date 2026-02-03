package JavaProblems;


import java.util.Scanner;

//13.  Given an integer array nums, find the subarray with the largest sum,
//and return its sum.
public class LargestSumSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i=0;i< nums.length;i++) {
            nums[i] = sc.nextInt();
        }

        int maxSum = Integer.MIN_VALUE;
        int start = 0, end = 0;

        for (int i = 0; i < nums.length; i++) {
            int currentSum = 0;

            for (int j = i; j < nums.length; j++) {
                currentSum += nums[j];

                if (currentSum > maxSum) {
                    maxSum = currentSum;
                    start = i;   // important
                    end = j;     // important
                }
            }
        }

        System.out.println("Maximum Sum = " + maxSum);
        System.out.print("Subarray = ");
        for (int i = start; i <= end; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}


