package edu.northeastern.ashish;

//https://leetcode.com/problems/majority-element/
public class Main {

    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(arr));
    }

    private static int majorityElement(int[] arr){
        if(arr.length ==0 || arr == null)
            return Integer.MIN_VALUE;
        int candidate = findCandidate(arr);
        int count = 0;
        for (int i : arr) {
          if(i == candidate){
              count++;
          }
        }
        if(count > arr.length/2)
            return candidate;
        return Integer.MIN_VALUE;
    }


    private static int findCandidate(int[] arr){
        int candidate = arr[0];
        int count = 1;
        for(int i = 1 ; i < arr.length; i ++){
            if(arr[i] == candidate){
                count ++;
            }else{
                count --;
            }
            if(count == 0 ){
                candidate = arr[i];
            }

        }
        return  candidate;

    }
}
