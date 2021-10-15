package chapter1_1;

public class Exercise27 {
  private static int count = 0;

  public static double binomial(int n, int k, double p) {
    double[][] cache = new double[n + 1][k + 1];
    for (int i = 0; i <= n; i++)
      for (int j = 0; j <= k; j++)
        cache[i][j] = Double.NaN;
    cache[0][0] = 1.0;
    return binomial(n, k, p, cache);
  }

  public static double binomial(int n, int k, double p, double[][] cache) {
    count++;
    if (n < 0 || k < 0) return 0.0;
    if (Double.isNaN(cache[n][k]))
      cache[n][k] = (1.0 - p) * binomial(n-1, k, p, cache) + p*binomial(n-1, k-1, p, cache);
    return cache[n][k];
  }

  public static void main(String[] args) {
    binomial(100, 50, 0.25);
    System.out.println(count);
  }
}
