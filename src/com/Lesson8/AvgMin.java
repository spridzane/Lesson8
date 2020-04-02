package com.Lesson8;

public class AvgMin {

    //declare instance variables
    private int[] numbers;
    private int min;

    public AvgMin() {
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    public int getMin() {
        return min;
    }

    public void computeMin(){
        //initialized the min with the first element of the []
        min = numbers[0];

        //traverse the [] from the 2nd element since we stored the 1st one in the variable min
        for(int i = 1; i < numbers.length; i++ ){
            //if the current element located in the [] numbers at index i is lower
            //than the value stored in the min then update the min with current element
            if(numbers[i]< min){
                //update the min with current value
                min = numbers[i];
            }
        }
    }//method
}//end class
