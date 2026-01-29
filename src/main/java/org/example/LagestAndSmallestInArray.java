package org.example;
import java.util.*;

public class LagestAndSmallestInArray {
    static void main(String[] args) {
        int a[] = {3, 2, 6, 10, 34};
        int small = a[0];
        int largest = a[0];
        for (int i = 0; i < a.length; i++) {
            if (small >= a[i])
                small = a[i];
            if (largest <= a[i])
                largest = a[i];
        }
        System.out.println("Smallest number in array is " + small);
        System.out.println("Largest number in array is " + largest);
    }
}
