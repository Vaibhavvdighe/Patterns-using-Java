import java.util.Scanner;

public class SolidRectangle {
    public static void main(String[] Args) {
        int row, cols;
        Scanner sc = new Scanner(System.in);
        row = sc.nextInt();
        cols = sc.nextInt();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
