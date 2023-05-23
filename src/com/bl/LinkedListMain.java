package com.bl;

public class LinkedListMain {

    public static void main(String[] args) {

        LinkedList<Integer> linkedList1 = new LinkedList<>();

        linkedList1.add(70);
        linkedList1.add(30);
        linkedList1.add(56);

        linkedList1.display();
        System.out.println();

        LinkedList<Integer> linkedList2 = new LinkedList<>();
        linkedList2.append(56);
        linkedList2.append(30);
        linkedList2.append(70);

        linkedList2.display();

    }
}