import java.util.Scanner;

public class TaskEight {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long x = sc.nextLong();
    long count = 0;
    for (long i = 1; i * i <= x; i++) {
      if (x % i == 0) {
        if (i * i == x) {
          count++;
        } else {
          count += 2;
        }
      }
    }
    System.out.println(count);
    sc.close();
  }
}

// by uran