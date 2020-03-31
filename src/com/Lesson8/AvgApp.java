package com.Lesson8;

import java.util.Scanner;

public class AvgApp {
    public static void main(String[] args) {
        //declare [] to store integer elements
        int[] numbers;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array: ");

        int size = input.nextInt();

        numbers = new int[size];

        //input
        //loop to prompt the user to input the number
        //in each iteration of loop to store the number provided by the user in the numbers [] at the index i
        for(int i = 0; i < size; i++){
            System.out.println("Enter value " + (i+1));
            numbers[i] = input.nextInt();
        }

        //processing
        AvgMax avgMax = new AvgMax();
        Avg avg = new Avg();
        //use a setter to store the numbers provided by the user
        avg.setNumbers(numbers);
        avgMax.setNumbers(numbers);
        avg.calculateAverage();
        avgMax.computeMax();
        //output
        double a = avg.getAverage();
        int b = avgMax.getMax();

        System.out.println("Average is: " + a);
        System.out.println("Max is: " + b);

    }//end main
}//end class
