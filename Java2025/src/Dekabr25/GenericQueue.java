package Dekabr25;

import java.util.LinkedList;
import java.util.Queue;

public class GenericQueue <T>{
    Queue <T> queue = new LinkedList<>();

    public void enqueue( T name){
        queue.add(name);
    }
    public void dequeue() {
        System.out.println(queue.poll());
    }
    public boolean isEmpty(){
        return queue.isEmpty();
    }

    public static void main(String[] args) {
    GenericQueue genericQueue = new GenericQueue();
    genericQueue.enqueue("4");
        genericQueue.dequeue();
        System.out.println(genericQueue.isEmpty());


    }
}
