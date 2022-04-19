public class CheckPrimeNumber {
    public static void main(String[] args) {

        PrimeThread pt = new PrimeThread(11);
        Thread t = new Thread(pt);
        t.start();
        PrimeThread pt2 = new PrimeThread(6);
        Thread t2 = new Thread (pt2);
        t2.start();

    }


    static class PrimeThread implements Runnable {

        int x;

        @Override
        public void run() {

            System.out.println(x + " is prime? : " + isPrime(x));

        }
        boolean isPrime(int num) {
            for (int n = 2; n<num; n++) {
                if (num%n == 0) return false; //reminder 0 means not prime
            }
            return true;
        }

        public PrimeThread(int x) {
            this.x = x;
        }
    }


}
