package chapter1_1;

import edu.princeton.cs.algs4.StdOut;

public class Exercise6 {
  public static void main(String[] args) {
    int f = 0;
    int g = 1;
    for (int i = 0; i <= 15; i++) {
      StdOut.println(f);
      f = f + g;
      g = f - g;
    }
  }
}
