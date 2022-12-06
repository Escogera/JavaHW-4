// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

import java.io.*;
import java.util.ArrayDeque;
import java.util.LinkedList;

public class s4hw1 {
    public static void reverse(LinkedList list) {
        LinkedList<Object> secondlinkedList = new LinkedList<Object>();
        for (int i = 0; i < list.size();) {
            secondlinkedList.add(list.remove(i));
        }

        for (int i = secondlinkedList.size() - 1; i >= 0; i--) {
            list.add(secondlinkedList.remove(i));
        }

        System.out.println("Перевернутый список: " + list);
    }

    public static void main(String[] args) {
        LinkedList<Object> linkedList = new LinkedList<Object>();
        linkedList.add(911);
        linkedList.add("Hello");
        linkedList.add(3.14);
        linkedList.add("Bye");
        linkedList.add("Great");
        linkedList.add(112);

        System.out.println("Исходный список: " + linkedList);
        reverse(linkedList);

    }

}
