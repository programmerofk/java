
/// by uran
import java.util.Scanner;

public class Java14 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println(transformDigits(n));
  }

  public static int transformDigits(int n) {
    String s = String.valueOf(n);
    String result = "";
    for (int i = 0; i < s.length(); i++) {
      int digit = s.charAt(i) - '0';
      if (digit % 2 == 0) {
        result += (digit + 1);
      } else {
        result += (digit - 1);
      }
    }
    return Integer.parseInt(result);
  }
}