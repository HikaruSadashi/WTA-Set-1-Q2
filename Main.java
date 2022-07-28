import java.util.*;
import java.util.HashMap;
import java.util.Map;

/*
  Test cases used:
  1. 
    {0, 3, 2, 5, 8},
    {9, 8, 10, 0, 9},
    {1, 7, 2, 3, 1},
    {8, 0, 6, 7, 2},
    {4, 1, 8, 5, 10} };
  
  2. 
    {5, 4, 6, 5, 8},
    {9, 8, 10, 3, 9},
    {1, 7, 2, 3, 1},
    {8, 1, 6, 7, 2},
    {4, 1, 8, 5, 0} };
*/

class Main {

  public static void main(String[] args) { 
    //type in the test case matrix here
    int matrix[][] = { 
    {5, 0, 0, 5, 8},
    {9, 8, 10, 3, 9},
    {0, 7, 2, 3, 1},
    {8, 0, 6, 7, 2},
    {4, 1, 8, 5, 10} };

    //calling method
    setZeroes(matrix);

    //printing result
    for (int i = 0; i < matrix.length; i++) {
         for (int j = 0; j < matrix[i].length; j++) { 
            System.out.print(matrix[i][j] + " ");
         }
         System.out.println(); 
      }
  }
  public static void setZeroes(int[][] matrix) {

    //initating vars & hashmap
    int R = matrix.length;
    int C = matrix[0].length;
    Set<Integer> rows = new HashSet<Integer>();
    Set<Integer> cols = new HashSet<Integer>();

    //We add any columns and rows that will be "popped"
    for (int i = 0; i < R; i++) {
      for (int j = 0; j < C; j++) {
        if (matrix[i][j] == 0) {
          rows.add(i);
          cols.add(j);
        }
      }
    }

    //"Pop" those elements that we marked previously
    for (int i = 0; i < R; i++) {
      for (int j = 0; j < C; j++) {
        if (rows.contains(i) || cols.contains(j)) {
          matrix[i][j] = 0;
        }
      }
    }
  }
}