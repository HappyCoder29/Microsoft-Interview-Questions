package edu.northeastern.ashish;

public class Main {

    public static void main(String[] args) {
        System.out.println(longestPalindromeSubstring("babad"));
    }

    private static String longestPalindromeSubstring(String str){
        int max = 1;
        int maxStart = 0;
        int maxEnd = 0;

        for(int i = 1; i < str.length() -1; i ++){
            int start = i-1;
            int end = i;
            // even
            while(start >=0 && end <= str.length()-1 && str.charAt(start) == str.charAt(end)){
                if( (end -start +1) > max){
                    max = end -start +1;
                    maxStart = start;
                    maxEnd = end;
                }

                start --;
                end ++;
            }

            // odd
            start = i-1;
            end = i+1;
            while(start >=0 && end <=str.length()-1 && str.charAt(start) == str.charAt(end)){
                if( (end -start +1) > max){
                    max = end -start +1;
                    maxStart = start;
                    maxEnd = end;
                }
                start --;
                end ++;
            }

        }

        return  str.substring(maxStart, maxEnd+1);
    }
}
