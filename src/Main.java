import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = getNumber();
        System.out.println("O valor digitado é: " + n);
    }

    public static int getNumber() {
        Scanner entrada = new Scanner(System.in);
        String numero;
        do {
            System.out.print("Digite o valor: ");
            numero = entrada.nextLine();
        } while (!eInteriro(numero));

        return Integer.parseInt(numero);
    }

    public static boolean eInteriro(String texto) {
        try {
            Integer.parseInt(texto);
            return true;
        } catch (Exception e) {
            System.out.println("O número digitado não é inteiro, tente novamente");
            return false;
        }
    }
}