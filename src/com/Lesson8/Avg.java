package com.Lesson8;

public class Avg {
    private int[] numbers;
    private double average;


    public Avg(){
        //numbers[] = null
        //average = 0.0
    }

    public void setNumbers(int[] numbers){
        this.numbers = numbers;
    }
    //processing method
    //compute the average of all the numbers from []
    public void calculateAverage(){
        int sum; //to store the sum of all the elements
        int currentElement; //to store the current element from the array

        sum = 0;

        for(int i = 0; i < numbers.length; i++){
            //retrieve the element at index i
            sum = sum + numbers[i];//update
        }
        //compute
        average = (double) sum/numbers.length;
    }
    //getter
    public double getAverage(){
        return average;
    }
}
