package chapter1_1;

public class Exercise14 {
  public static int lg(int n) {
    if (n < 1) {
      throw new ArithmeticException("n should be positive");
    }
    int x = 1, y = 0;
    while (x <= n) {
      x <<= 1;
      ++y;
    }
    return y - 1;
  }

  public static void main(String[] args) {
    System.out.println(lg(1));
    System.out.println(lg(2));
    System.out.println(lg(5));
    System.out.println(lg(1023));
    System.out.println(lg(1024));
    System.out.println(lg(1025));
  }
}
