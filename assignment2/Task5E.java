import java.util.Scanner;

public class Task5E {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int row1 = sc.nextInt();
    int col1 = sc.nextInt();
    int row2 = sc.nextInt();
    int col2 = sc.nextInt();
    int rowDiff = Math.abs(row1 - row2);
    int colDiff = Math.abs(col1 - col2);
    if ((rowDiff == 2 && colDiff == 1) || (rowDiff == 1 && colDiff == 2)) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
    sc.close();
  }
}

// by uran