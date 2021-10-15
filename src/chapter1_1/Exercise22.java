package chapter1_1;

import edu.princeton.cs.algs4.StdOut;

public class Exercise22 {
  public static int rank(int key, int[] a) {
    return rank(key, a, 0, a.length - 1, 0);
  }

  public static int rank(int key, int[] a, int lo, int hi, int depth) {
    for (int i = 0; i < depth; i++) StdOut.print("  ");
    StdOut.printf("lo: %d, hi: %d\n", lo, hi);
    if (lo > hi) return -1;
    int mid = lo + (hi - lo) / 2;
    if (key < a[mid]) return rank(key, a, lo, mid - 1, depth + 1);
    else if (key > a[mid]) return rank(key, a, mid + 1, hi, depth + 1);
    else return mid;
  }

  public static void main(String[] args) {
    StdOut.println(rank(3, new int[]{1,2,3,4,5,6,7,8,9,10}));
    StdOut.println(rank(8, new int[]{1,3,5,7,9}));
  }
}
