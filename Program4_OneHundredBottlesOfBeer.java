import java.util.Scanner;
public class Program4_OneHundredBottlesOfBeer {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("| How many verses of the song 'One Hundred Bottles of Beer' would you like me to print?");
    int songLoop = input.nextInt();
    int beersLeft = 100;

    for (int i = 0; i <= songLoop; i++) {
      System.out.println("\n"+ beersLeft + " bottles of beer on the wall\n"+ beersLeft + " bottles of beer\nIf one of those bottles should happen to fall");
      beersLeft -= 1;
      System.out.println(beersLeft + " bottles of beer on the wall");
    }

    input.close();
  }
}
