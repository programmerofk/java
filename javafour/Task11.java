import java.util.Scanner;

public class Task11 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long binary = sc.nextLong();
    long decimal = 0;
    long power = 1;
    while (binary > 0) {
      decimal += (binary % 10) * power;
      binary /= 10;
      power *= 2;
    }
    System.out.println(decimal);
    sc.close();
  }
}