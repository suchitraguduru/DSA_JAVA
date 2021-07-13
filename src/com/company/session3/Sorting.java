package com.company.session3;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] arr = {78,3,7,34,13,74,25,57,46};
        System.out.println("Before Sorting: " +  Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("After BubbleSort: " + Arrays.toString(arr));
        insertionSort(arr);
    }

    private static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {


        }
    }

    private static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr.length-1-i; j++) {
                if(arr[j] > arr[j+1]){
                    swap(arr, j, j+1);
                }
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int maxElement(int[] arr){
        int maxInd = 0;
        for(int i = 1; i<arr.length; i++){
            if(arr[maxInd] < arr[i]){
                maxInd = i;
            }
        }
        return maxInd;
    }
}
