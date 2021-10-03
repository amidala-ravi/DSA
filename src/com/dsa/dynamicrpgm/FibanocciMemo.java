package com.dsa.dynamicrpgm;

public class FibanocciMemo {

    private long fibanoci(int no, long[] memo) {
        if(memo[no] != 0) return memo[no];
        if(no == 1 || no == 2) return 1;
        long result= fibanoci(no-1, memo) + fibanoci(no-2, memo);
        memo[no] = result;
        return memo[no];
    }

    public static void main(String[] args) {
        FibanocciMemo fm = new FibanocciMemo();
        int n =50;
        long[] memo = new long[n+1];
        System.out.println(fm.fibanoci(n, memo));
    }
}
