package edu.northeastern.ashish;

import java.util.Arrays;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    private static boolean twoSumNLogN(int[] arr, int target){
        Arrays.sort(arr);
        int start = 0;
        int end = arr.length -1;

        while(start < end){
            int sum = arr[start] + arr[end];
            if(sum == target ){
                return true;
            }else if(sum < target){
                start++;
            }else{
                end--;
            }
        }
        return  false;
    }

    private static boolean twoSumHashtable(int[] arr, int target){
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0 ; i < arr.length ; i ++){
            int complement = target - arr[i];
            if (map.containsKey(complement)) {
                return true;
            }
            map.put(arr[i], i);
        }

        return false;
    }

}
