
/// by uran
import java.util.ArrayList;
import java.util.Scanner;

public class TaskFifteen {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    ArrayList<Integer> balls = new ArrayList<>();

    for (int i = 0; i < n; i++) {
      balls.add(sc.nextInt());
    }

    int destroyed = 0;
    boolean changed = true;

    while (changed) {
      changed = false;
      for (int i = 0; i < balls.size() - 2; i++) {
        int currentColor = balls.get(i);
        int count = 1;

        for (int j = i + 1; j < balls.size(); j++) {
          if (balls.get(j) == currentColor) {
            count++;
          } else {
            break;
          }
        }

        if (count >= 3) {
          destroyed += count;
          for (int k = 0; k < count; k++) {
            balls.remove(i);
          }
          changed = true;
          break;
        }
      }
    }

    System.out.println(destroyed);
    sc.close();
  }
}