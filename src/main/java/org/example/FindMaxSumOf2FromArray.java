package org.example;
public class FindMaxSumOf2FromArray
{
    public static void main( String[] args )
    {
        int[] array = {2,4,3,5,1};
        maxTwo(array);
    }
    static void maxTwo(int[] array){
        int big;
        int small;
        if(array[0]>array[1]){
            big = array[0];
            small = array[1];
        }else{
            big = array[1];
            small = array[0];
        }
        for(int i =2;i<array.length;i++){
            if(array[i]>big){
                small = big;
                big=array[i];
            }else if (array[i]>small && array[i]!=big){
                small = array[i];
            }
        }
        System.out.println(big+ " , "+small);
    }
}
