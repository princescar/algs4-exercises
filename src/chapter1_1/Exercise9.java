package chapter1_1;

import edu.princeton.cs.algs4.StdOut;

public class Exercise9 {
  public static String toBinaryString(int n) {
    int x = n;
    String s = "";
    while (x > 0) {
      if (x % 2 == 1) s = '1' + s;
      else s = '0' + s;
      x >>= 1;
    }
    return s;
  }

  public static void main(String[] args) {
    StdOut.println(toBinaryString(1) + " " + Integer.toBinaryString(1));
    StdOut.println(toBinaryString(2) + " " + Integer.toBinaryString(2));
    StdOut.println(toBinaryString(3) + " " + Integer.toBinaryString(3));
    StdOut.println(toBinaryString(999) + " " + Integer.toBinaryString(999));
    StdOut.println(toBinaryString(999999999) + " " + Integer.toBinaryString(999999999));
  }
}
