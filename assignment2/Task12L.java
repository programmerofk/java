import java.util.Scanner;

public class Task12L {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int k = sc.nextInt();
    int m = sc.nextInt();
    int n = sc.nextInt();

    if (n == 0) {
      System.out.println(0);
      return;
    }

    int sessions = (2 * n + k - 1) / k;

    int totalTime = Math.max(2, sessions) * m;

    System.out.println(totalTime);

    sc.close();
  }
}