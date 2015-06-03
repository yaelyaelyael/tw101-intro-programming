import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Asterisk.printOneAsterisk();
        Asterisk.drawHorizontalLine(8);
        Asterisk.drawVerticalLine(3);

        Asterisk.drawRightTriangle(3);
        Asterisk.drawIsoscelesTriangle(3);

        Asterisk.drawCenteredDiamond(3);
        Asterisk.drawCenteredDiamondWithName(10);



        FizzBuzz.fizzbuzz();



        ArrayList<Integer> results = new ArrayList<Integer>();

        PrimeFactors p = new PrimeFactors();
        results = p.generate(30);

        for (Integer r : results) {
            System.out.println(r);
        }



    }
}
