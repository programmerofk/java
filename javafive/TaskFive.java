
/// by uran
import java.util.Scanner;

public class TaskFive {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int prev = sc.nextInt();

    for (int i = 1; i < n; i++) {
      int curr = sc.nextInt();
      if ((prev > 0 && curr > 0) || (prev < 0 && curr < 0)) {
        System.out.println("YES");
        return;
      }
      prev = curr;
    }

    System.out.println("NO");
    sc.close();
  }
}