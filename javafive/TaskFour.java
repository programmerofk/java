
/// by uran
import java.util.Scanner;

public class TaskFour {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int prev = sc.nextInt();
    int count = 0;
    for (int i = 1; i < n; i++) {
      int curr = sc.nextInt();
      if (curr > prev) {
        count++;
      }
      prev = curr;
    }
    System.out.println(count);
    sc.close();
  }
}