package school.mjc.stage0.conditions.finalTask;

public class CoordinatePane {
    public void printQuadrant(int x, int y) {

//       if(x > 0 && y > 0){
//           System.out.println("first");
//       } else if (x < 0 && y > 0) {
//           System.out.println("second");
//       } else if (x < 0 && y < 0) {
//           System.out.println("third");
//       } else if (x > 0 && y < 0) {
//           System.out.println("fourth");
//       }else if ((x == 0 && y != 0) || y == 0 && x != 0){
//           System.out.println("zero");
//       }

                String quadrant = x > 0 ? (y > 0 ? "first" : y < 0 ? "fourth" : "zero") : x < 0 ? (y > 0 ? "second" : y < 0 ? "third" : "zero") : "zero";

                System.out.println(quadrant);
            }
        }



}
