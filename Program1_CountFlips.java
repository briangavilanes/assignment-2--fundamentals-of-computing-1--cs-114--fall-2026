public class Program1_CountFlips {
  public static void main(String[] args) {
    final int finalRound = 100;
    int roundCounter = 0;
    int headsCount = 0;
    int tailsCount = 0;

    while (roundCounter != finalRound) {
      roundCounter += 1;

      Coin coin = new Coin();

      if (coin.isHeads() == true) {
        headsCount += 1;
      } else {
        tailsCount += 1;
      }
    }

    System.out.println("| Results |\n| Heads: " + headsCount + "\n| Tails: " + tailsCount );
  }
}
