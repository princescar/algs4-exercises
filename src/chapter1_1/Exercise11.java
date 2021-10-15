package chapter1_1;

import edu.princeton.cs.algs4.StdOut;

public class Exercise11 {
  public static void print(boolean[][] matrix) {
    int m = matrix.length, n = matrix[0].length;
    StdOut.print(" ");
    for (int i = 0; i < n; i++) {
      StdOut.print(" ");
      StdOut.print(i + 1);
    }
    StdOut.println();
    for (int i = 0; i < m; i++) {
      StdOut.print(i + 1);
      for (int j = 0; j < n; j++) {
        boolean b = matrix[i][j];
        StdOut.print(b ? " *" : "  ");
      }
      StdOut.println();
    }
  }

  public static void main(String[] args) {
    print(new boolean[][]{{true, false, false}, {false, true, false}, {true, false, true}});
  }
}
