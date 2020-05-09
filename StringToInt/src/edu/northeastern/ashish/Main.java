package edu.northeastern.ashish;

public class Main {

    public static void main(String[] args) {
        System.out.println(getIntegerFromString("0"));
    }

    private static int getIntegerFromString(String str){
        boolean isNegative = false;

        if(str.length() == 0)
            return  0;
        if(str.charAt(0) == '-'){
            isNegative = true;
        }
        int result = 0;

        int limit = isNegative ? 1 : 0;
        int length = str.length() -1;
        for(int i = str.length() -1; i >= limit ; i --){
            int val = str.charAt(i) - '0';
            result += val * Math.pow(10, length -i);
        }

        if(isNegative)
            result *= -1;
        return result;
    }
}
