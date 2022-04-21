package com.Stacks;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
	   var stack = new StackBuilder();
       stack.push(5);
       stack.push(10);
       stack.push(20);
       stack.pop();
        System.out.println(stack.peek());
       stack.print();
        System.out.println(stack.min());
    }
}
