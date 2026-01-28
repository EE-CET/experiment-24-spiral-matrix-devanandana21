import java.util.*;

public class SpiralMatrix {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] mat = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int top = 0, bottom = r - 1;
        int left = 0, right = c - 1;

        boolean first = true;

        while (top <= bottom && left <= right) {

            // Top row
            for (int j = left; j <= right; j++) {
                if (!first) System.out.print(" ");
                System.out.print(mat[top][j]);
                first = false;
            }
            top++;

            // Right column
            for (int i = top; i <= bottom; i++) {
                System.out.print(" " + mat[i][right]);
            }
            right--;

            // Bottom row
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    System.out.print(" " + mat[bottom][j]);
                }
                bottom--;
            }

            // Left column
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(" " + mat[i][left]);
                }
                left++;
            }
        }

        sc.close();
    }
}
