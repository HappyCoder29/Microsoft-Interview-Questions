package edu.northeastern.ashish;

import java.util.LinkedList;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        System.out.println(removeKDigitsToMakeSmallest("10200", 3));
    }

    private static String removeKDigitsToMakeSmallest(String num, int k){
        LinkedList<Character> stack = new LinkedList<Character>();

        for(int i = num.length() -1; i >=0; i --){
            while(stack.size() > 0 && k > 0 && stack.peekLast() > num.charAt(i)) {
                stack.removeLast();
                k -= 1;
            }
            stack.addLast(num.charAt(i));

        }
        /* remove the remaining digits from the tail. */
        for(int i=0; i<k; ++i) {
            stack.removeLast();
        }

        // build the final string, while removing the leading zeros.
        StringBuilder ret = new StringBuilder();
        boolean leadingZero = true;
        for(char digit: stack) {
            if(leadingZero && digit == '0') continue;
            leadingZero = false;
            ret.append(digit);
        }

        /* return the final string  */
        if (ret.length() == 0) return "0";
        return ret.toString();
    }
}
