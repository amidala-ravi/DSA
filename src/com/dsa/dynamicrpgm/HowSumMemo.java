package com.dsa.dynamicrpgm;

import java.util.ArrayList;
import java.util.HashMap;
// Improvement is not working for memo, check later
public class HowSumMemo {
    // Brute Force Algo
    private ArrayList<Integer> howSum(int targetValue, int[] numEle, ArrayList<Integer> howSum) {
        if (targetValue == 0) return new ArrayList();
        if (targetValue < 0) return null;
        for (int ele : numEle) {
            int newTargetVal = targetValue - ele;
            howSum = howSum(newTargetVal, numEle, howSum);
            if (howSum != null) {
                howSum.add(ele);
                return howSum;
            }
        }
        return howSum;
    }


    private ArrayList<Integer> howSumImprovement(int targetValue, int[] numEle, ArrayList<Integer> howSum,  HashMap<Integer, ArrayList<Integer>> memo) {
        if (memo.get(targetValue) != null) return memo.get(targetValue);
        if (targetValue == 0) return new ArrayList();
        if (targetValue < 0) return null;
        System.out.print(targetValue+" ");
        for (int ele : numEle) {
            int newTargetVal = targetValue - ele;
            howSum = howSumImprovement(newTargetVal, numEle, howSum, memo);
            if (howSum != null) {
                howSum.add(ele);
                memo.put(targetValue, howSum);
                return memo.get(targetValue);
            }
        }
        System.out.println("====");
        memo.put(targetValue, null);
        return memo.get(targetValue);
    }

    public static void main(String[] args) {
        HowSumMemo hsm = new HowSumMemo();
        int[] numElems = {2,4,2};
        int targetVal = 11;
        //int[] memo = new  int[targetVal+1];
        HashMap<Integer, ArrayList<Integer>> memo = new HashMap<>();

        System.out.println(hsm.howSumImprovement(targetVal, numElems, new ArrayList<>(), memo));
    }
}
