
/// by uran
import java.util.Scanner;

public class TaskTen {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int max = sc.nextInt();

    for (int i = 1; i < n; i++) {
      int current = sc.nextInt();
      if (current > max) {
        max = current;
      }
    }

    System.out.println(max);
    sc.close();
  }
}
