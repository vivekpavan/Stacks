package com.Stacks;

import java.util.Stack;

public class StringReverser {
    public String reverse(String input){
        Stack<Character> stack = new Stack<>();
//        for(var i=0;i<input.length();i++){
//            stack.push(input.charAt(i));
//        }
        if(input == null){
            throw new IllegalArgumentException();
        }
        for(char a : input.toCharArray()){
            stack.push(a);
        }
        var reverse = new StringBuffer();
        while(!stack.empty()){
            reverse.append(stack.pop());
        }
        return reverse.toString();
    }
}
