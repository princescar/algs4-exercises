package chapter1_1;

public class Exercise20 {
  // e ^ (m + n) = e ^ m + e ^ n
  // ln(m*n) = ln(m) + ln(n)
  public static double lnFactorial(int n) {
    if (n < 1) {
      throw new ArithmeticException("n should be positive.");
    }
    if (n == 1) return 0;
    return lnFactorial(n - 1) + Math.log(n);
  }

  public static void main(String[] args) {
    System.out.println(lnFactorial(0));
    System.out.println(lnFactorial(10000));
  }
}
