package com.training.cch;

import java.util.Scanner;

public class FindMissingNumber {

    //sort array
    public static int[] sortArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++){
                int tmp = 0;
                if (arr[i] > arr[j]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        return arr;
    }

    //Find the missing number
    public static int findMissingNumber(int[] nums) {
       int n=nums.length;
       int sum=((n+1)*(n+2))/2;
        for (int num : nums) sum -= num;
        return sum;
    }
    public static void main(String[] args){
        System.out.println("Enter the number pattern , Separately  :");
        Scanner inputs = new Scanner(System.in);
        String numSeq = inputs.next();
        String[] tempList = numSeq.split(",");
        int size = tempList.length;
        int[] array = new int[size];
        for (int i = 0; i < size; i++)
        {
            array[i] = Integer.parseInt(tempList[i]);
        }
        //sort array
        sortArray(array);
        //Find the missing number
        System.out.println("Missing number is :"+findMissingNumber(array));
    }
}
