
/// by uran
import java.util.Scanner;

public class TaskTwelve {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] heights = new int[n];

    for (int i = 0; i < n; i++) {
      heights[i] = sc.nextInt();
    }

    int petya = sc.nextInt();
    int pos = 1;

    for (int i = 0; i < n; i++) {
      if (heights[i] < petya) {
        break;
      }
      pos++;
    }

    System.out.println(pos);
    sc.close();
  }
}