package com.Lesson8;
import java.util.Scanner;
public class CalcApp {
    public static void main(String[] args) {
        //declare local variables
        int [] numbers;
        int size;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an array: ");
        size = sc.nextInt();

        numbers = new int[size];

        for(int i = 0; i < size; i++){
            System.out.println("Please enter number " + (i+1));
            numbers[i] = sc.nextInt();
        }

        //processing
        AvgMaxMin result = new AvgMaxMin();
        result.setNumbers(numbers);
        result.calcAvg();
        double a = result.getAvg();
        System.out.println("Average: " + a);

        result.calcMax();
        int b = result.getMax();
        System.out.println("Max: " + b);

        result.calcMin();
        int c = result.getMin();
        System.out.println("Min: " + c);

    }//end main
}//end class
