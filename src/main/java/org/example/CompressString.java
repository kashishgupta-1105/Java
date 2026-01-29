package org.example;
import java.awt.*;
import java.util.*;
//4. Compress a string in the below format
//Input: -> "aaabbcccdd"
//Output: -> "a3b2c3d2"

public class CompressString {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String res = "";

        int i = 0;
        while (i < s.length()) {
            char current = s.charAt(i);
            int count = 1;

            // Count consecutive same characters
            while (i + count < s.length() && s.charAt(i + count) == current) {
                count++;
            }

            // Append character and its count
            res += current + String.valueOf(count);

            // Move to the next new character
            i += count;
        }

        System.out.println(res);
    }
}
