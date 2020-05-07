package edu.northeastern.ashish;

public class Main {

    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        sortColors(arr);
        System.out.println("");
    }


    private static void sortColors(int[] arr){
        if(arr.length <=1)
            return;
        int low = 0;
        int mid = 0;
        int high = arr.length -1;

        while(mid < high){
            if( arr[mid] ==1 ){
                mid ++;
            }
            else if (arr[mid] < 1){
                swap(arr, low, mid);
                low ++;
                mid ++;
            }else {
                swap(arr, mid, high);
                high--;
            }
        }

    }

    private static void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

    }
}
