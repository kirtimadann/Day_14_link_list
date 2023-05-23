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

    public E pop() {
        E temp = head.getData();
        head = head.getNext();
        return temp;
    }

    public E popLast() {
        E temp = tail.getData();
        Node<E> secondLast = head;
        while(secondLast.getNext() != tail){
            secondLast = secondLast.getNext();
        }
        secondLast.setNext(null);
        tail = secondLast;
        return temp;
    }
}
