package edu.northeastern.ashish;

public class Main {

    enum direction {left, right, top, down}
    public static void main(String[] args) {
        int[][] matrix =    {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        printSpiral(matrix);

    }

    public static void printSpiral(int[][] arr)
    {
        int N_ROWS = arr.length;
        int N_COLS = arr[0].length;
        direction dir = direction.right;
        int up_limit = 0;
        int down_limit = N_ROWS - 1;
        int left_limit = 0;
        int right_limit = N_COLS - 1;
        int Count = N_ROWS * N_COLS;
        int row = 0;
        int col = 0;

        while (Count > 0)
        {
            System.out.println(arr[row][col]);

            if (dir == direction.right)
            {
                col++;
                if (col > right_limit)
                {
                    col--;
                    dir = direction.down;
                    up_limit++;
                    row++;
                }
            }
            else if (dir == direction.down)
            {
                row++;
                if (row > down_limit)
                {
                    row--;
                    dir = direction.left;
                    right_limit--;
                    col--;
                }
            }
            else if (dir == direction.left)
            {
                col = col - 1;
                if (col < left_limit)
                {
                    ++col;
                    dir = direction.top;
                    --down_limit;
                    --row;
                }
            }
            else if (dir == direction.top) /* direction == up */
            {
                row = row - 1;
                if (row < up_limit)
                {
                    ++row;
                    dir = direction.right;
                    ++left_limit;
                    ++col;
                }
            }
            Count--;
        }
    }

}
