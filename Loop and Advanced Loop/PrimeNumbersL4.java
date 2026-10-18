public class PrimeNumbersL4 {
    public static void main(String[] args) {
        int n = 20;
        System.out.print("output: ");
        for(int i = 2; i<=n; i++) { 
            if(isPrime(i)){
                System.out.print(i + " ");
                
            }
        }
    }

    private static boolean isPrime(int number) {
        for (int divisor = 2; divisor * divisor <= number; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}
