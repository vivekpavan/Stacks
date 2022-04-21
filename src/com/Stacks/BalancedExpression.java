package com.Stacks;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class BalancedExpression {
    private final List<Character> leftBrackets = Arrays.asList('(', '[', '{', '<');
    private final List<Character> rightBrackets = Arrays.asList(')', ']', '}', '>');
    private String input;

    public BalancedExpression(String input1){
        input = input1;
    }
    public Boolean Balance() {
        Stack<Character> stack = new Stack<>();

        for(var ch : input.toCharArray()) {
            if (isleftBrackets(ch))
                stack.push(ch);

            if (isrightBrackets(ch)) {
                if (stack.empty()) return false;

                var top = stack.pop();
                if (!balance(top, ch)) return false;
            }
        }
        return  stack.empty();
    }
    private boolean isleftBrackets(char ch){
        return (leftBrackets.contains(ch));
    }
    private boolean isrightBrackets(char ch){
        return rightBrackets.contains(ch);
    }
    private boolean balance(char left,char right) {
        return (leftBrackets.indexOf(left) == rightBrackets.indexOf(right));
    }
    }