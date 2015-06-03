
import java.util.ArrayList;

public class PrimeFactors {

    public ArrayList<Integer> generate(int n) {
        ArrayList<Integer> primeFactors = new ArrayList<Integer>();

        for (int i = 2; i < n; i++) {
            if ((isPrime(i) == true) && (isFactor(n, i) == true)) {
                primeFactors.add(i);
            }
        }
        return primeFactors;
    }

    public boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (isFactor(n, i) == true) {
                return false;
            }
        }
        return true;
    }

    public boolean isFactor(int x, int y) {
        if (x % y == 0) {
            return true;
        }
        else {
            return false;
        }
    }

}
