import java.util.*;

class pattern1 {
    public static void main(String[] args) {
        int i, j, n = 1;
        for (i = 5; i <= n; i++) {
            for (j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}