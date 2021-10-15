package chapter1_1;

import java.math.BigInteger;

import edu.princeton.cs.algs4.StdOut;

public class Exercise19 {
  public static long f(int n) {
    if (n == 0) return 0;
    if (n == 1) return 1;
    return f(n-1) + f(n-2);
  }

  public static BigInteger f2(int n) {
    if (n == 0) return BigInteger.valueOf(0);
    BigInteger[] cache = new BigInteger[n + 1];
    cache[0] = BigInteger.valueOf(0);
    cache[1] = BigInteger.valueOf(1);
    return f2(n, cache);
  }

  public static BigInteger f2(int n, BigInteger[] cache) {
    if (cache[n] == null)
      cache[n] = f2(n-1, cache).add(f2(n-2, cache));
    return cache[n];
  }

  public static void main(String[] argv) {
    for (int n = 0; n < 100; n++) {
      StdOut.println(n + " " + f2(n));
    }
  }
}
