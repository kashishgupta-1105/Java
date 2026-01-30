package JavaConcepts;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args){
        int i = 1;

        //while loop
        while(i<=10){
            System.out.println(i);
            i++;
        }
        //for loop
        for(int j = 11;j<=20;j++){
            System.out.println(j);
        }

        for(;i<20;i++){
            System.out.println(i);
        }

        //DoWhile loop
        int n = 1;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter a number : ");
            n = sc.nextInt();
        }
        while(n<=5);
            System.out.println(n);


    }
}
