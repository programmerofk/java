
/// by uran
import java.util.Scanner;

public class Java11 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    System.out.println("LCM = " + lcm(a, b));
  }

  public static int lcm(int a, int b) {
    return (a * b) / gcd(a, b);
  }

  public static int gcd(int a, int b) {
    while (b != 0) {
      int temp = b;
      b = a % b;
      a = temp;
    }
    return a;
  }
}