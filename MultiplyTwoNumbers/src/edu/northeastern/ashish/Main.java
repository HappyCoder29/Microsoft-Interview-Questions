package edu.northeastern.ashish;

public class Main {

    public static void main(String[] args) {
        System.out.println(multiplyTwoNumbers("12", "-12"));
    }

    private static int multiplyTwoNumbers(String str1, String str2){
       int num1 = Integer.parseInt(str1);
       int num2 = Integer.parseInt(str2);
       boolean isNegative1 = num1 < 0 ? true: false;
       boolean isNegative2 = num2 < 0 ? true: false;

       if(isNegative1)
           num1 *= -1;

       int result = 0;
       int limit = isNegative2 ? 1: 0;
       // We can just multiply both of them and get result but that would be cheating
        for(int i = str2.length() -1; i >= limit; i --){
            int val = str2.charAt(i) - '0';
            result += val * num1 * (int)Math.pow(10, str2.length()-1 -i);
        }
        if(isNegative1 != isNegative2)
            result *= -1;
        return  result;
    }


    }



