package com.Lesson8;

public class AvgMaxMin {
    //declare instantiable variables
    private int [] numbers;
    private double avg;
    private int max;
    private int min;

    //constructor
    public AvgMaxMin(){
    }
    //setter
    public void setNumbers(int[] numbers){
        this.numbers = numbers;
    }
    //getters
    public int getMax(){
        return max;
    }
    public int getMin(){
        return min;
    }
    public double getAvg(){
        return avg;
    }

    public void calcAvg(){
        int sum = 0;
        int len = numbers.length;
        for(int i = 0; i < len; i++ ){
            sum = sum + numbers[i];
        }
        avg = (double) sum/len;
    }

    public void calcMax(){
        max = numbers[0];
        int len = numbers.length;
        for(int i = 1; i < len; i++){
            if(max < numbers[i]){
                max = numbers[i];
            }
        }
    }

    public void calcMin(){
        min = numbers[0];
        int len = numbers.length;
        for(int i = 1; i < len; i++){
            if(min > numbers[i]){
                min = numbers[i];
            }
        }
    }

}//end class
