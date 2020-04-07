package com.Anmol.Queue;

import java.util.Queue;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        PriorityQueue queue = new PriorityQueue(5);
        queue.enqueue(2);
        queue.enqueue(6);
        queue.enqueue(5);
        int front = queue.dequeue();
        System.out.println(front);
    }
    public static void reverse(Queue<Integer> queue){
        Stack<Integer> stack = new Stack<>();
        while (!queue.isEmpty())
            stack.push(queue.remove());
        while (!stack.isEmpty())
            queue.add(stack.pop());
    }
}
