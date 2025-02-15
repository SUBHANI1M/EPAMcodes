public class Pattern {

    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print("#");
            }
            for (int j = 0; j < 6 - i * 2; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 6 - i * 2; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print("#");
            }
            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }
            System.out.println("");
        }
        for (int i = 3; i >= 0; i--) {
            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print("#");
            }
            for (int j = 0; j < 6 - i * 2; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 6 - i * 2; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print("#");
            }
            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }
            System.out.println("");
        }

    }
}