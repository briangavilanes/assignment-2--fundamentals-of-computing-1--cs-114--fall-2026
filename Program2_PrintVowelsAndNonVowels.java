import java.util.ArrayList;
import java.util.Scanner;

public class Program2_PrintVowelsAndNonVowels {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("| Please input a string:");
    String userString = input.nextLine();

    int textLength = userString.length();

    int nonVowelCount = 0;
    int vowelCount = 0;

    while (textLength > 0) {
      textLength -= 1;

      char letter = userString.charAt(textLength);

      if (letter == 'A' || letter == 'a' || letter == 'E' || letter == 'e' || letter == 'I' || letter == 'i' || letter == 'O' || letter == 'o' || letter == 'U' || letter == 'u') {
        nonVowelCount += 1;
      } else {
        vowelCount += 1;
      }
    }

    input.close();
  }
}
