import java.util.*;

public class reversepyramid {
    public static void main(String args[]) {
        int n = 5; // total rows

        for (int i = n; i >= 1; i--) { // outer loop for rows
            for (int j = 1; j <= i; j++) { // inner loop for stars
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
