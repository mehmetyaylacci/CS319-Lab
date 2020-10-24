import java.util.ArrayList;

public class PrimeGenerator {

    private boolean isPrime(int number) {
        if (number <= 1)
            return false;

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0)
                return false;
        }

        return true;
    }

    public ArrayList<Integer> generatePrimes ( int limit) { ArrayList<Integer> primes = new ArrayList<Integer>();
        for ( int i = 1 ; i <= limit; i++) { if (isPrime(i)) primes. add (i);
        } return primes; }
}
