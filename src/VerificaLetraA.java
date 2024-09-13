import java.util.Scanner;

public class VerificaLetraA {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase.");
        String input = scanner.nextLine();

        int count = 0;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == 'a' || c == 'A') {
                count++;
            }
        }

        if (count > 0) {
            System.out.println("A letra 'a' aparece " + count + " vezes.");
        } else {
            System.out.println("A letra 'a' não apareceu nesta frase.");
        }

        scanner.close();
    }
}
