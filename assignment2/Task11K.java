import java.util.Scanner;

public class Task11K {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    boolean canBuy = false;
    for (int x = 0; x * 3 <= k; x++) {
      int remainder = k - x * 3;
      if (remainder % 5 == 0) {
        canBuy = true;
        break;
      }
    }
    if (canBuy) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }

    sc.close();
  }
}