package chapter1_1;

import java.util.Arrays;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Exercise23 {
  public static int rank(int key, int[] a) {
    int lo = 0;
    int hi = a.length - 1;
    while (lo <= hi) {
      int mid = lo + (hi - lo) / 2;
      if (key < a[mid]) hi = mid - 1;
      else if (key > a[mid]) lo = mid + 1;
      else return mid;
    }
    return -1;
  }

  public static void main(String[] args) {
    int[] whitelist = new In(args[0]).readAllInts();
    boolean printOnList = args[1].equals("-");
    Arrays.sort(whitelist);
    while (!StdIn.isEmpty()) {
      int key = StdIn.readInt();
      if (rank(key, whitelist) < 0) {
        if (!printOnList) StdOut.println(key);
      } else {
        if (printOnList) StdOut.println(key);
      }
    }
  }
}
