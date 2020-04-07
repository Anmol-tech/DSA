package com.Anmol.Queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Main {

  public static void main(String[] args) {
    Queue<Integer> queue = new ArrayDeque<>();
    QueueReverser<Integer> reverser = new QueueReverser<>();
    queue.add(2);
    queue.add(3);
    queue.add(12);
    queue.add(13);
    queue.add(11);
    System.out.println(queue);
    reverser.reverse(queue, 4);
    System.out.println(queue);
  }

  public static void reverse(Queue<Integer> queue) {
    Stack<Integer> stack = new Stack<>();
    while (!queue.isEmpty()) stack.push(queue.remove());
    while (!stack.isEmpty()) queue.add(stack.pop());
  }
}
