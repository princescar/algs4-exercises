package chapter1_1;

import edu.princeton.cs.algs4.StdOut;

public class Exercise3 {
  public static void main(String[] args) {
    int x = Integer.parseInt(args[0]);
    int y = Integer.parseInt(args[1]);
    int z = Integer.parseInt(args[2]);
    boolean eq = x == y && y == z;
    StdOut.println(eq ? "equal" : "not equal");
  }
}
