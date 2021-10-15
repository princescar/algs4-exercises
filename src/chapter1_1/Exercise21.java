package chapter1_1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Exercise21 {
  public static void main(String[] args) {
    while (!StdIn.isEmpty()) {
      String name = StdIn.readString();
      int num1 = StdIn.readInt();
      int num2 = StdIn.readInt();
      double num3 = (double)num1 / num2;
      StdOut.printf("%s\t%d\t%d\t%.3f\n", name, num1, num2, num3);
    }
  }
}
