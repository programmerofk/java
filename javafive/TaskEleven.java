
/// by uran
import java.util.Scanner;

public class TaskEleven {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int count = 1;
    int prev = sc.nextInt();

    for (int i = 1; i < n; i++) {
      int curr = sc.nextInt();
      if (curr != prev) {
        count++;
      }
      prev = curr;
    }

    System.out.println(count);
    sc.close();
  }
}