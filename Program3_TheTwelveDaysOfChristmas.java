public class Program3_TheTwelveDaysOfChristmas {
  public static void main(String[] args) {
    System.out.println("12 days of christmas\n");

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

      message += " day of Christmas, my true love gave to me";

      switch (i) {
        case 12:
          message += "\nTwelve drummers drumming,";
        case 11:
          message += "\nEleven pipers piping,";
        case 10:
          message += "\nTen lords a-leaping,";
        case 9:
          message += "\nNine ladies dancing,";
        case 8:
          message += "\nEight maids a-milking,";
        case 7:
          message += "\nSeven swans a-swimming,";
        case 6:
          message += "\nSix geese a-laying,";
        case 5:
          message += "\nFive golden rings,";
        case 4:
          message += "\nFour calling birds,";
        case 3:
          message += "\nThree French hens,";
        case 2:
          message += "\nTwo turtle doves, and";
        case 1:
          message += "\nA partridge in a pear tree.";
      }

      message += "\n____________________\n";

      System.out.println(message);
    }
  }
}
