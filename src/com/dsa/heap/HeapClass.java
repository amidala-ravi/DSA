package com.dsa.heap;

import java.util.ArrayList;
import java.util.List;

public class HeapClass {
    private static List<Integer> arryList;

    private static void swapElements(int x, int y) {
        int temp = arryList.get(x);
        arryList.set(x, arryList.get(y));
        arryList.set(y, temp);
    }

    private static void minHeap() {
        int i = 0;
        int swapped = 0, temp =0;
        while(true) {
            System.out.println(arryList);
            temp = swapped = 0;
            if (arryList.get(i) > arryList.get(2 * i + 1)) {
                swapElements(i, 2*1 +1);
                temp++;
            } else if (arryList.get(i) > arryList.get(2 * i + 2)) {
                swapElements(i, 2*1 +2);
                temp++;
            }
            if (temp == swapped) break;
        }
    }

    public static void main(String[] args) {
        arryList = new ArrayList<Integer>();
        arryList.add(90);
        arryList.add(30);
        arryList.add(20);
        arryList.add(10);
        arryList.add(70);
        arryList.add(60);
        arryList.add(40);
        System.out.println(arryList);
        swapElements(3, 4);
        System.out.println(arryList);
        minHeap();
        System.out.println(arryList);
    }
}
