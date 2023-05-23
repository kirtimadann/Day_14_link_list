package com.bl;

public class LinkedList <E> {

    Node<E> head ;

    Node<E> tail ;

    public void add(E data){
        Node<E> newNode = new Node<>(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else {
            newNode.setNext(head);
            head = newNode;
        }
    }

    public void display() {
        Node<E> temp = head;
        if(head == null){
            System.out.println("Linked List is empty");
        }
        while(temp != null){
            System.out.print(temp.getData() + " ");
            temp = temp.getNext();
        }
    }

    public void append(E data) {
        Node<E> newNode = new Node<>(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else {
            tail.setNext(newNode);
            tail = newNode;
        }
    }
}
