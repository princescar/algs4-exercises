package chapter1_1;

import edu.princeton.cs.algs4.StdOut;

public class Exercise24 {
  public static int gcd(int p, int q) {
    return gcd(p, q, 0);
  }

  public static int gcd(int p, int q, int depth) {
    for (int i = 0; i < depth; i++) StdOut.print("  ");
    StdOut.printf("p: %d, q: %d\n", p, q);
    if (q == 0) return p;
    int r = p % q;
    return gcd(q, r, depth + 1);
  }

  public static void main(String[] args) {
    StdOut.println(gcd(105, 24));
    StdOut.println(gcd(24, 105));

    int p = Integer.parseInt(args[0]);
    int q = Integer.parseInt(args[1]);
    StdOut.println(gcd(p, q));
  }
}
