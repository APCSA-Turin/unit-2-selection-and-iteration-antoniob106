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
    /* Returns true if the three provided lengths create a right triangle, in
     other words, a2 + b2 = c2, where c is the longest side; returns false
     Otherwise (hint: use the largest() method that you wrote).
     Note the "largest" side could be any of the 3 numbers, i.e. your method
     should work if side1 = 3, side2 = 4, and side3 = 5 and also if
     side1 = 5, side2 = 4, and side3 = 3
   */
  public boolean rightTriangle(int side1, int side2, int side3) {
    /* implement this method */
    side1 *= side1;
    side2 *= side2;
    side3 *= side3;
    int hypotenuse = largest(side1,side2,side3);
    int legs = (side1+side2+side3) - hypotenuse;
    if (legs == hypotenuse) {
      return true;
    } else {
      return false;
    }
  }
}