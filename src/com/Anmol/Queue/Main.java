package com.Anmol.Queue;

import java.util.Queue;
import java.util.Stack;

public class Main {

  public static void main(String[] args) {
    LinkedlistQueue queue = new LinkedlistQueue();
    queue.enqueue(10);
    queue.enqueue(20);
    queue.enqueue(40);
    queue.enqueue(30);
    queue.dequeue();
    var value = queue.peek();
    System.out.println(queue.size());
  }

  public static void reverse(Queue<Integer> queue) {
    Stack<Integer> stack = new Stack<>();
    while (!queue.isEmpty()) stack.push(queue.remove());
    while (!stack.isEmpty()) queue.add(stack.pop());
  }
}
