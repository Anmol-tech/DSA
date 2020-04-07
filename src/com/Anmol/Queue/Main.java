package com.Anmol.Queue;

import java.util.Queue;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        QueueUsingStack queue = new QueueUsingStack(5);
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(7);
        queue.enqueue(8);
        queue.dequeue();
        queue.enqueue(100);
        queue.dequeue();
//        queue.dequeue();
//        queue.dequeue();
        System.out.println(queue);
    }
    public static void reverse(Queue<Integer> queue){
        Stack<Integer> stack = new Stack<>();
        while (!queue.isEmpty())
            stack.push(queue.remove());
        while (!stack.isEmpty())
            queue.add(stack.pop());
    }
}
