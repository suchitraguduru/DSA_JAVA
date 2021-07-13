package com.company.session3;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayIntro {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = {4,5,6,7,8,9};
        System.out.println(Arrays.toString(arr));

        int elt = 5;
        int ls = linearSearch(arr, elt);
        System.out.println("Linear Search: " + ls);
        int bs = binarySearch(arr, elt);
        System.out.println("Binary Search: " +  bs);

        System.out.println(maxElement(arr));

    }

    public static int binarySearch(int[] arr, int elt) {
        int start = 0, end = arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid] == elt){
                return mid;
            }else if(arr[mid] < elt){
                start = mid+1;
            }else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static int linearSearch(int[] arr, int elt) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == elt){
                return i;
            }
        }
        return -1;
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
