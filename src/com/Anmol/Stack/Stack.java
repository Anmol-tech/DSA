package com.Anmol.Stack;

import java.util.EmptyStackException;

public class Stack {
    private int top;
    private int[] stack;
    private int size;
    public Stack(int length) {
        stack = new int[length];
        top = -1;
        size = length;
    }
    public void push(int element){
        top++;
        if(top >=size)
            throw new StackOverflowError();
        stack[top] = element;
    }
    public void pop(){
        peek();
        top--;
    }
    public void peek(){
        if(top<=-1)
            throw new EmptyStackException();
        System.out.println(stack[top]);
    }
    public boolean isEmpty(){
        return top <=-1;
    }

}
