package org.example;

public class TwoDimensionalArraySwapDiagonal {

    public static void main(String[] args) {
        int[][] array = {{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4}};
        switchDiagonal(array);

    }

    static void switchDiagonal(int[][] input){

        for(int i=0;i<input.length;i++){
            for(int j=0;j<input[i].length;j++){
                if(i==j){
                    int temp = input[i][j];
                    input[i][j]=input[i][0];
                    input[i][0]=temp;
                }
                System.out.print(input[i][j]+",");
            }
            System.out.println();
        }
    }
}
