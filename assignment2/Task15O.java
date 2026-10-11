import java.util.Scanner;

public class Task15O {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int firstNumber = Integer.parseInt(scanner.nextLine());
    int secondNumber = Integer.parseInt(scanner.nextLine());
    if (firstNumber > secondNumber) {
      System.out.println(1);
    } else if (firstNumber < secondNumber) {
      System.out.println(2);
    } else {
      System.out.println(0);
    }
    scanner.close();
  }
}

// by uran