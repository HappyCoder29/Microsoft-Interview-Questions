package edu.northeastern.ashish;

public class Main {

    public static void main(String[] args) {
        int arr[] = { 6, 5, 1, 2, 3, 4 };
        System.out.println(SearchRotatedArray(arr, 2));

    }

    static int SearchRotatedArray(int[] arr, int x)
    {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end)
        {
            int mid = (start + end) / 2;
            if (arr[mid] == x)
                return mid;
            else if (arr[mid] < arr[end]) // right half is properly sorted
            {
                if (arr[mid] < x && x <= arr[end])
                {
                    // value is on right side
                    start = mid + 1;
                }
                else
                {
                    end = mid - 1;
                }
            }
            else// left side is properly sorted
            {
                if (x >= arr[start] && x < arr[mid])
                {
                    // value is in left side
                    end = mid - 1;
                }
                else
                {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }



}
