package com.Stacks;

import java.sql.Array;
import java.util.Stack;

public class StackBuilder {
        private int[]  stack;
        public StackBuilder(){
            stack = new int[0];
        }
        public void push(int item){
            var array = new int[ stack.length+ 1];
            for(var i = 0;i< stack.length;i++)
                array[i] = stack[i];
            stack = array;
            stack[stack.length - 1] = item;
        }

        public void pop(){
            var array = new int[ stack.length - 1];
            for(var i = 0;i< stack.length -1;i++)
                array[i] = stack[i];
            stack = array;
        }
        public int peek(){
            if(stack.length == 0){
                throw new IllegalArgumentException();
            }
            return stack[stack.length - 1];
        }
        public  boolean isEmpty(){
            if(stack[0] == 0){
                return true;
            }
            return false;
        }
        public void print(){
            for(var i = 0;i<stack.length;i++)
                System.out.println(stack[i]);
        }
        public int min(){
            var min = stack[0];
            for(var i =1;i<stack.length;i++){
                if(stack[i] < min)
                    min = stack[i];
            }
            return min;
        }
}
