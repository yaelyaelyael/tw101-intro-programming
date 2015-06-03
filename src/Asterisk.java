
public class Asterisk {

    public static void printOneAsterisk() {
        System.out.println("*");
    }

    public static void drawHorizontalLine(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
    }

    public static void drawVerticalLine(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("*");
        }
    }


    public static void drawRightTriangle(int n) {
        for (int i = 1; i < n + 1; i++) {
            drawHorizontalLine(i);
            System.out.println("");
        }
    }

    public static void drawIsoscelesTriangle(int n) {

        int totalBottomChars = (2 * n) - 1;
        int asteriskCount;
        int whiteSpaceCount;

        for (int i = 0; i < n; i++) {
            asteriskCount = (2 * i) + 1;
            whiteSpaceCount = (totalBottomChars - asteriskCount) / 2;

            for (int j = 0; j < whiteSpaceCount; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < asteriskCount; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void drawCenteredDiamond(int n) {
        int middleRowLength = (2 * n) - 1;
        int asteriskCount;
        int whiteSpaceCount;

        for (int i = 0; i < n; i++) {
            asteriskCount = (2 * i) + 1;
            whiteSpaceCount = (middleRowLength - asteriskCount) / 2;

            for (int j = 0; j < whiteSpaceCount; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < asteriskCount; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        int count = n - 1;

        for (int l = count; l > 0; l--) {
            asteriskCount = (2 * l) - 1;
            whiteSpaceCount = (middleRowLength - asteriskCount) / 2;

            for (int m = 0; m < whiteSpaceCount; m++) {
                System.out.print(" ");
            }

            for (int o = 0; o < asteriskCount; o++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void drawCenteredDiamondWithName(int n) {
        int middleRowLength = (2 * n) - 1;
        int asteriskCount;
        int whiteSpaceCount;

        for (int i = 0; i < n-1; i++) {
            asteriskCount = (2 * i) + 1;
            whiteSpaceCount = (middleRowLength - asteriskCount) / 2;

            for (int j = 0; j < whiteSpaceCount; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < asteriskCount; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        int nameWhiteSpace = (middleRowLength - "Yael".length()) / 2;
        for (int y = 0; y < nameWhiteSpace; y++) {
            System.out.print(" ");
        }
        System.out.print("Yael");
        System.out.println();


        int count = n - 1;


        for (int l = count; l > 0; l--) {
            asteriskCount = (2 * l) - 1;
            whiteSpaceCount = (middleRowLength - asteriskCount) / 2;

            for (int m = 0; m < whiteSpaceCount; m++) {
                System.out.print(" ");
            }

            for (int o = 0; o < asteriskCount; o++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


}