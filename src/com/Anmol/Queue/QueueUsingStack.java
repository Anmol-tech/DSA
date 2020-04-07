package com.Anmol.Queue;


import java.util.Stack;

public class QueueUsingStack {
    private Stack<Integer> stackPush = new Stack<>();
    private Stack<Integer> stackPop = new Stack<>();
    private int count = 0;
    private int length;

    public QueueUsingStack(int length) {
        this.length = length;
    }

    public void enqueue(int item) {
        if (length == count)
            throw new IllegalStateException();
        stackPush.push(item);
        count++;
    }

    public int dequeue() {
        if (count == 0)
            throw new IllegalStateException();
        if (stackPop.isEmpty())
            while (!stackPush.isEmpty())
                stackPop.push((stackPush.pop()));
        count--;
        return stackPop.pop();
    }

    @Override
    public String toString() {
        return (stackPush.toString().replace("]", "") + ", " + stackPop.toString().replace("[", ""));
    }

}
