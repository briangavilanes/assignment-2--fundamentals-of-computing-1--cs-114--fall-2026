import java.util.Scanner;
public class Program4_OneHundredBottlesOfBeer {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("| How many verses of the song 'One Hundred Bottles of Beer' would you like me to print?");
    int songLoop = input.nextInt();
    int beersLeft = 100;

    input.close();
  }
}
