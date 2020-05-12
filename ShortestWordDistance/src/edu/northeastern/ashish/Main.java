package edu.northeastern.ashish;

import java.util.HashSet;
//https://leetcode.com/problems/shortest-word-distance/
public class Main {

    public static void main(String[] args) {

        String[] words = {"practice", "makes", "perfect", "coding", "makes"};
        System.out.println(wordDistance(words, "coding", "practice"));

    }

    private static int wordDistance(String[] words, String str1, String str2){
        int minDistance = Integer.MAX_VALUE;
        int index1 = -1;
        int index2 = -1;
       for(int i = 0 ; i < words.length; i ++){
           if(str1.equals(words[i])){
               index1 = i;
           }
           if(str2.equals(words[i])){
               index2 = i;
           }
           minDistance = Math.min(minDistance, Math.abs(index1-index2));
       }
       return minDistance;

    }
}
