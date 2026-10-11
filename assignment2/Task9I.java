import java.util.Scanner;

public class Task9I {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int c = scanner.nextInt();
    int d = scanner.nextInt();
    if (c == 0 && d == 0) {
      System.out.println("NO");
      return;
    }
    if (a == 0) {
      if (b == 0) {
        System.out.println("INF");
      } else {
        System.out.println("NO");
      }
    } else {
      int x = -b / a;
      if (b % a == 0 && c * x + d != 0) {
        System.out.println(x);
      } else {
        System.out.println("NO");
      }
    }
  }
}

// by uran