package com.Lesson8;

public class AvgMax {
    //declare instance variables
    private int[] numbers;
    private int max;

    public AvgMax (){
        //numbers[] = null
        //average = 0.0
        //max = 0
    }
    //setter
    public void setNumbers(int[] numbers){
        this.numbers = numbers;
    }

        public void computeMax(){
        max = numbers[0];
            for(int i = 1; i < numbers.length; i++ ){
                //if the current element of [] located at i > value stored in max
                //update max with the current element
                if(numbers[i]> max){
                    //update the max with current value
                    max = numbers[i];
                }
            }
        }

        public int getMax(){
        return max;
        }
}//end class
