package JavaProblems;

import java.util.*;
//12. Given an array of integers and an integer target, return indices of the
//two numbers such that they add up to target.

public class TwoSum {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        System.out.println("Enter array values: ");
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Enter target: ");
        int target = sc.nextInt();

        for (int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
             if(a[i]+a[j]==target)
                 System.out.println(i+" "+j);
            }
        }



    }
}
