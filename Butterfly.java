public class Butterfly {
    public static void main(String[] Args) {
        int n = 4;
        //1st Half
        for (int i = 1; i <= n; i++) {
            //Stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //Space
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            //stars
            for (int j = 1; j <= i; j++) {
                    System.out.print("*");
            }

            System.out.println();
        }

        //2nd Half
        for (int i = n; i >= 1; i--) {
            //Stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            //Spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // //Stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}