package com.Lesson8;

public class MultiDimensionalArray {
    public static void main(String[] args) {

        //rows and columns
        int[][] twoD = {{1, 2, 3},
                        {6, 7, 8, 9},
                        {9, 2}};

        System.out.println(twoD[2][1] + " ");

        int[][] twoDi = new int[3][3];

        for (int i = 0; i < twoD.length; i++) {
            for(int j = 0; j < twoD[i].length; j++){
                //System.out.print(twoD[i][j] + " ");
            }
            //System.out.println();
        }
    } //end main
}