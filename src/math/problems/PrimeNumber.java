package math.problems;

public class PrimeNumber {

    public static void main(String[] args) {
        /*
        Write a method to print the list of prime numbers from 2 to 1,000,000
            Solving the problem should be your first priority, however bonus points if you can figure out how to
            improve algorithmic efficiency

         Print out the prime numbers in the given range.
         */
        // Create a boolean array
        // "[0..n]" and
        // initialize all entries
        // it as true. A value in
        // prime[i] will finally be
        // false if i is Not a
        // prime, else true.
        int n = 0;
        boolean PrimeNumber[] = new boolean[n + 1];
        for (int i = 0; i <= n; i++)
            PrimeNumber[i] = true;

        // If prime[p] is not changed, then it is a
        // prime
        for (int p = 2; p * p <= n; p++)
            if (PrimeNumber[p] == true) {
                // Update all multiples of p
                for (int i = p * p; i <= n; i += p)
                    PrimeNumber[i] = false;

                // Print all  PrimeNumber
                for (int i = 2; i <= n; i++) {
                    if (PrimeNumber[i] == true)
                        System.out.print(i + " ");
                }

            }

    }
}