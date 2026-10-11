import java.util.Scanner;

public class Task2B {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int row1 = sc.nextInt();
    int col1 = sc.nextInt();
    int row2 = sc.nextInt();
    int col2 = sc.nextInt();
    if (row1 == row2 || col1 == col2) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
    sc.close();
  }
}

// by uran