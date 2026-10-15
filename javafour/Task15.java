import java.util.Scanner;

public class Task15 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    long b = sc.nextLong();
    long c = sc.nextLong();
    long d = sc.nextLong();

    for (int x = 0; x <= 1000; x++) {
      long result = a * x * x * x + b * x * x + c * x + d;
      if (result == 0) {
        System.out.print(x + " ");
      }
    }
    sc.close();
  }
}