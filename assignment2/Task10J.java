import java.util.Scanner;

public class Task10J {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int c = scanner.nextInt();
    int d = scanner.nextInt();
    int totalCost = a * 100 + b;
    int totalPaid = c * 100 + d;
    int change = totalPaid - totalCost;
    int e = change / 100;
    int f = change % 100;
    System.out.println(e + " " + f);
    scanner.close();
  }
}

// by uran