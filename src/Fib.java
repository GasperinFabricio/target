import java.util.Scanner;

public class Fib {

    public static boolean fibCheck(int n) {
        if (n == 0 || n == 1) {
            return true;
        }

        int a = 0, b = 1;

        while (b < n) {
            int temp = a;
            a = b;
            b = temp + b;
        }

        return b == n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = scanner.nextInt();

        if (fibCheck(num)) {
            System.out.println("O número " + num + " pertence!");
        } else {
            System.out.println("O número " + num + " NÃO pertence!");
        }

        scanner.close();
    }
}
