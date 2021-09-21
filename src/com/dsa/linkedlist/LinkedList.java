package com.dsa.linkedlist;

//Single Linked list
public class LinkedList {
    Node head;
    static class Node {
        Node next;
        int data;

        Node(int data) {
            this.data = data;
        }
    }


    private void traverse(Node node) {
        while(node.next != null) {
            System.out.print(node.data + "-->");
            node = node.next;
        }
        System.out.println(node.data);
    }

    private boolean searchNode(Node head, int search) {
        if(head == null) return false;
        while(head != null) {
            if(head.data == search)
                return true;
            else
                head = head.next;
        }
        return false;
    }

    private Node insertAtStart(Node head, Node node) {
        if(node == null)
            return node;
        node.next = head;
        head = node;
        return head;
    }

    //Driver code
    public  static void main(String[] args) {
        LinkedList lst = new LinkedList();
        // Creating nodes
        Node node1 = new Node(10);
        Node node2 = new Node(20);
        Node node3 = new Node(30);
        Node node4 = new Node(40);
        Node node5 = new Node(50);
        // adding all nodes
        lst.head = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        // traverse all nodes data
        lst.traverse(lst.head); // 10-->20-->30-->40-->50
        System.out.println(lst.searchNode(lst.head, 50)); // expected -> true
        Node node6 = new Node(35);
        lst.head = lst.insertAtStart(lst.head, node6);
        lst.traverse(lst.head);
    }



}
