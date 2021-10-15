package chapter1_1;

import edu.princeton.cs.algs4.StdOut;

public class Exercise13 {
  public static void printTranspose(int[][] matrix) {
    int m = matrix.length, n = matrix[0].length;
    for (int j = 0; j < n; j++) {
      for (int i = 0; i < m; i++) {
        StdOut.print(matrix[i][j]);
        StdOut.print(" ");
      }
      StdOut.println();
    }
  }

  public static void main(String[] args) {
    printTranspose(new int[][]{{1},{2},{3}});
    printTranspose(new int[][]{{1,2,3}});
    printTranspose(new int[][]{{1,2,3},{4,5,6},{7,8,9}});
  }
}
