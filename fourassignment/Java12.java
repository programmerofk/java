
/// by uran
import java.util.Scanner;

public class Java12 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println(reverseNumber(n));
  }

  public static int reverseNumber(int n) {
    int reversed = 0;
    while (n > 0) {
      reversed = reversed * 10 + n % 10;
      n /= 10;
    }
    return reversed;
  }
}