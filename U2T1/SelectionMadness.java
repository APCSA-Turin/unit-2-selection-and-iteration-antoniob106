package U2T1;

public class SelectionMadness {

  public SelectionMadness() { }

  public String fortune() {
     int random = (int) (Math.random() * 5) + 1;
     String fortune = "";
     if (random == 1) {
        fortune = "you will meet the love of your life";
     }
     else if (random == 2) {
        fortune = "the sky will be clear in the morning";
     }
     else if (random == 3) {
        fortune = "this saturday will be the greatest";
     }
     else if (random == 4) {
        fortune = "a crow will gift you a dollar";
     }
     else if (random == 5) {
        fortune = "your favorite games will be on discount this week";
     }
     return fortune;
  }

  public int largest(int num1, int num2, int num3) {
     if (num1 > num2) {
        if (num1 > num3) {
            return num1;
        } else {
            return num3;
        }
     } else {
        if (num2 > num3) {
            return num2;
        } else {
            return num3;
        }
     }
  }
}