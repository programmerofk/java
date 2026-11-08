/// by uran

import java.util.Scanner;

public class TaskOne {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for (int i = 0; i < n; i++) {
      int x = sc.nextInt();
      if (i % 2 == 0) {
        System.out.print(x + " ");
      }
    }
    sc.close();
  }
}
