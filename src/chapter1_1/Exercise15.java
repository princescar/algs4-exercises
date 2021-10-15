package chapter1_1;

public class Exercise15 {
  public static int[] histogram(int[] a, int m) {
    int[] ans = new int[m];
    for (int x : a) {
      if (x >= 0 && x < m) {
        ans[x]++;
      }
    }
    return ans;
  }

  public static void main(String[] args) {
    int[] result = histogram(new int[]{1,1,2,1,4,9,2,7}, 5);
    for (int i = 0; i < 5; i++) {
      System.out.println(i + ": " + result[i]);
    }
  }
}
