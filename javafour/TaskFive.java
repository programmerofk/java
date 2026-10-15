import java.util.Scanner;

public class TaskFive {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int rev = 0;
    while (x > 0) {
      rev = rev * 10 + x % 10;
      x /= 10;
    }
    System.out.println(rev);
    sc.close();
  }
}

// by uran