package com.dsa.dynamicrpgm;

import java.util.HashMap;
import java.util.Map;

public class GridTravelerMemo {

    private long gridTraveler(int row, int col, Map<String, Long> gridRembr) {
        String key = row+"-"+col;
        if(gridRembr.get(key) != null) return gridRembr.get(key);
        if(row == 1 && col == 1) return 1;
        if(row == 0 || col == 0) return 0;

        long result = gridTraveler(row-1, col, gridRembr) + gridTraveler(row, col-1, gridRembr);
        gridRembr.put(key, result);
        return gridRembr.get(key);
    }
    public static void main(String[] args) {
        Map<String, Long> gridRembr = new HashMap<>();
        GridTravelerMemo gm = new GridTravelerMemo();
        System.out.println(gm.gridTraveler(2,3, gridRembr));//3
        System.out.println(gm.gridTraveler(3,2, gridRembr));//3
        System.out.println(gm.gridTraveler(3,3, gridRembr)); //6
        System.out.println(gm.gridTraveler(18,18, gridRembr)); //2333606220
        System.out.println(gm.gridTraveler(25,25, gridRembr)); //32247603683100
    }
}
