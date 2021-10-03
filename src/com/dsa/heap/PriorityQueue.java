package com.dsa.heap;

import java.util.Vector;

public class PriorityQueue {
    int capacity;

    private Vector<Integer> A;

    PriorityQueue(){
        A = new Vector<>();
    }

    PriorityQueue(int capacity) {
        A = new Vector<>(capacity);
    }

    public int size() {
        return A.size();
    }

    public Boolean isEmpty() {
        return A.isEmpty();
    }

    public void add(int val) {
        A.addElement(val);
        int index = size() -1;
        heapify_up(index);
    }
    private void heapify_up(int i) {
        if (i > 0 && A.get(parent(i)) > A.get(i)) {
            swap(i, parent(i));
            heapify_up(parent(i));
        }
    }

    void swap(int x, int y) {
        Integer temp = A.get(x);
        A.setElementAt(A.get(y), x);
        A.setElementAt(temp, y);
    }

    // return left child of `A[i]`
    private int LEFT(int i) {
        return (2*i + 1);
    }

    // return right child of `A[i]`
    private int RIGHT(int i) {
        return (2*i + 2);
    }

    // return parent of `A[i]`
    private int parent(int i)
    {
        // if `i` is already a root node
        if (i == 0) {
            return 0;
        }
        return (i - 1) / 2;
    }



    private  void print() {
        System.out.println(A);
    }


    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue(10);

        pq.add(50);
        pq.add(20);
        pq.add(10);
        pq.add(30);
        pq.print();
    }
}
