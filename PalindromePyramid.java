public class PalindromePyramid {
    public static void main(String[] Args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            //Spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            //Number - 1st half
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            //Number - 2nd half
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
