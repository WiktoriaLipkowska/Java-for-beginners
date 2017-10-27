import java.util.*;
public class NewClass {
  public static void main(String[] args) {
    int[][] a = { { -34, 2, 8, 3, 5, 9, 6, 7, 3 },
                  { 3, 1, 55, 2, 1, 5, 9, 3, 0 },
                  { 2, 2, 181, 8, 6, 2, 5, 1, 4 }
                };
    System.out.println("Printed with deepToString:");
    System.out.println(Arrays.deepToString(a));

    System.out.println("And printed with an even-better printArray:");
    printArray(a);
  }

  // even better version!
  public static void printArray(int[][] a) {
    int rows = a.length;
    int cols = a[0].length;
    System.out.print("[ ");
    for (int row=0; row<rows; row++) {
      if (row > 0) System.out.print("  ");
      System.out.print("[");
      for (int col=0; col<cols; col++) {
        if (col > 0) System.out.print(", ");
        System.out.format("%3d",a[row][col]); // field-width = 3
      }
      System.out.println("]");
    }
    System.out.println("]");
  }
}
    
