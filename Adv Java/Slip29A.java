class OddNumbersThread extends Thread {
    private int n;

    public OddNumbersThread(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        System.out.println("Odd numbers between 1 and " + n + ":");
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}

class PrimeNumbersThread extends Thread {
    private int n;

    public PrimeNumbersThread(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        System.out.println("Prime numbers between 1 and " + n + ":");
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    private boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

public class Slip29A {
    public static void main(String[] args) {
        int n = 50; // Change this value to your desired number

        // Create and start the threads
        OddNumbersThread oddThread = new OddNumbersThread(n);
        PrimeNumbersThread primeThread = new PrimeNumbersThread(n);

        oddThread.start();
        primeThread.start();

        try {
            // Wait for both threads to finish
            oddThread.join();
            primeThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
