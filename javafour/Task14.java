import java.util.Scanner;

public class Task14 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    boolean hasZero = false;
    for (int i = 0; i < n; i++) {
      int num = sc.nextInt();
      if (num == 0) {
        hasZero = true;
        break;
      }
    }
    if (hasZero) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
    sc.close();
  }
}
