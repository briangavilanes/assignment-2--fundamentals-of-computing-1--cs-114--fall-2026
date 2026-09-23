public class Program3_TheTwelveDaysOfChristmas {
  public static void main(String[] args) {
    for (int i = 1; i <= 12; i++) {
      String message = "On the " + i;

      switch (i) {
        case 1:
          message += "st";
          break;
        case 2:
          message += "nd";
          break;
        case 3:
          message += "rd";
          break;
        default:
          message += "th";
          break;
      }
    }
  }
}
