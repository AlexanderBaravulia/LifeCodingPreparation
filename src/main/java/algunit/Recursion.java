package algunit;

public class Recursion {
        public static int gcd(int a, int b) {
            // Базовый случай
            if (b == 0) {
                return a;
            }
            // Рекурсивный вызов
            return gcd(b, a % b);
        }

        public static void main(String[] args) {
            int num1 = 21;
            int num2 = 14;
            System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd(num1, num2));
        }
}
