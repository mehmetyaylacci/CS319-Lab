import java.util.ArrayList;

public class PrimeGenerator {

    private boolean prime[];
    private final int soeLimit = 1000000;

    public PrimeGenerator() {
        this.prime = new boolean[this.soeLimit + 1];
        for (int i = 2; i < this.soeLimit; i++)
            prime[i] = true;
        sieveOfEratosthenes(this.soeLimit);
    }

    private void sieveOfEratosthenes(int n) {
        for (int p = 2; p * p <= n; p++) {
            if (prime[p]) {
                for (int i = p * 2; i <= n; i += p)
                    prime[i] = false;
            }
        }
    }

    private boolean isPrime(int number) {
        if (number <= this.soeLimit) {
            return prime[number];
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }

    public ArrayList<Integer> generatePrimes(int limit) {
        ArrayList<Integer> primes = new ArrayList<Integer>();
        for (int i = 1; i <= limit; i++) {
            if (isPrime(i))
                primes.add(i);
        }
        return primes;
    }
}
