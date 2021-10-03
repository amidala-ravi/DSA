package com.dsa.dynamicrpgm;

import java.util.HashMap;
import java.util.Map;

public class CanSumMemo {

    private boolean canSum(int targetSum, int []arryEle, Map<Integer, Boolean> memo) {
        if(memo.get(targetSum) != null) return memo.get(targetSum);
        if (targetSum == 0) return true;
        if (targetSum < 0) return false;
        for (int ele: arryEle) {
            int newTargetSum = targetSum - ele;
            boolean res = canSum(newTargetSum, arryEle, memo);
            if (res == true) {
                memo.put(targetSum, true);
                return memo.get(targetSum);
            }
        }
        memo.put(targetSum, false);
        return memo.get(targetSum);
    }
    public static void main(String[] args) {
        int arrayEle[] = {7};
        CanSumMemo cs = new CanSumMemo();
        int targetSum = 10002;
        Map<Integer, Boolean> memo = new HashMap<>();
        System.out.println(cs.canSum(targetSum, arrayEle, memo)); // true
    }
}
