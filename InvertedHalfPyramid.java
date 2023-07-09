public class InvertedHalfPyramid {
    public static void main(String[] Args) {
        int n = 5;
        for (int i = n; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
