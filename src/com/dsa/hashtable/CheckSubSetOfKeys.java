package com.dsa.hashtable;

public class CheckSubSetOfKeys {
    private boolean checkSubsetOfKeys(int[] arr1, int arr2[]) {

        for(int val2: arr2) {
            for(int val1: arr1) {
                if(val2 == val1) {
                    break;
                } else if (val1 == arr1[arr1.length-1]) {
                    return false;
                }
            }
        }
        return true;
    }


    public static void main(String []args) {
        int arr1[] = {10, 30, 5, 25, 40, 11};
        int arr2[] = {5, 30, 10};
        CheckSubSetOfKeys keys = new CheckSubSetOfKeys();
        if(keys.checkSubsetOfKeys(arr1, arr2))
            System.out.println("arr2[] is subset of arr1[]");
        else
            System.out.println("arr2[] is not subset of arr1[]");
    }
}
