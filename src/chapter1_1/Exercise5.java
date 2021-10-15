package chapter1_1;

import edu.princeton.cs.algs4.StdOut;

public class Exercise5 {
  public static void exercise5(double x, double y) {
    boolean valid = x > 0 && x < 1 && y > 0 && y < 1;
    StdOut.println(valid);
  }

  public static void main(String[] args) {
    exercise5(0.1, 0.2);
    exercise5(0.1, 0);
    exercise5(0, 0);
    exercise5(1, 1);
    exercise5(0, 1);
    exercise5(0.5, 0.5);
    exercise5(-0.5, 0.5);
    exercise5(-0.5, -0.5);
  }
}
