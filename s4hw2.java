
// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый элемент из очереди и удаляет его, 
// first() - возвращает первый элемент из очереди, не удаляя.
import java.io.*;
import java.util.LinkedList;

public class s4hw2 {
    public static void enqueue(LinkedList list, Object element) { // помещает элемент в конец очереди
        list.addLast(element);
    }

    public static void dequeue(LinkedList list) { // возвращает первый элемент из очереди и удаляет его
        System.out.println(list.get(0));
        list.removeFirst();
    }

    public static void first(LinkedList list) { // возвращает первый элемент из очереди, не удаляя
        System.out.println(list.get(0));
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
        enqueue(linkedList, 231);
        dequeue(linkedList);
        first(linkedList);
        System.out.println("Конечный список: " + linkedList);

    }
}
