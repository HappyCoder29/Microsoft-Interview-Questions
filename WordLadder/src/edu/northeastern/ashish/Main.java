package edu.northeastern.ashish;

public class Main {

    public static void main(String[] args) {
        String str1 = "Hit";
        String str2 = "test";
       int test =  editDistance(str1, str2);
    }


    static int editDistance(String str1, String str2)
    {
        int[][] matrix = new int[str1.length() + 1][ str2.length() + 1];
        int row = matrix.length;
        int col = matrix[0].length;
        for (int i = 0; i < row; i++)
        {
            matrix[i][0] = i;
        }
        for (int i = 0; i < col; i++)
        {
            matrix[0][i] = i;
        }

        for(int i = 1 ; i < row; i ++){
            for(int j = 1; j < col; j ++){
                if ( str1.charAt(i - 1) == str2.charAt(j - 1) )
                {
                    matrix[i][ j] = matrix[i - 1][ j - 1];
                }
                else
                {
                    matrix[i][ j] = 1 + Math.min(   matrix[i - 1][ j - 1],
                                                    Math.min(   matrix[i - 1][ j],
                                                                matrix[i][ j - 1] )
                                                );

                }
            }

        }
        return matrix[str1.length()][ str2.length()];




//        for (int i = 0; i < matrix.GetLength(0); i++)
//        {
//            matrix[i, 0] = i;
//        }
//        for (int i = 0; i < matrix.GetLength(1); i++)
//        {
//            matrix[0,i] = i;
//        }
//
//        for (int i = 1; i <= str1.Length; i++)
//        {
//            for (int j = 1; j <= str2.Length; j++)
//            {
//                if (str1[i - 1] == str2[j - 1])
//                {
//                    matrix[i, j] = matrix[i - 1, j - 1];
//                }
//                else
//                {
//                    matrix[i, j] = 1 + Math.Min(matrix[i - 1, j - 1], Math.Min(matrix[i - 1, j], matrix[i, j - 1] ));
//                }
//            }
//
//        }
//
//        return matrix[str1.Length, str2.Length];
    }

}
