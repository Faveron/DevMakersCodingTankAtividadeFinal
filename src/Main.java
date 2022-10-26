import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int quantidadeN, validador;
        double media = 0.0;
        String operacao;
        ArrayList<Double> valores = new ArrayList();

        System.out.println("O programa a seguir executa uma das duas médias, aritméticas ou harmônica\n");

        System.out.println("Insira a quantidade de valores (número inteiro) a ser calculado a média\n");
        quantidadeN = getNumberInt();

        System.out.println("\nDigite os valores a serem somados");
        for (int i = 0; i < quantidadeN; i++) {
            valores.add(getNumberDouble(i+1));
        }

        System.out.println("\nDigite ARITMETICA caso queria fazer a média aritmética.");
        System.out.println("Digite HARMONICA caso queria fazer a média harmônica.");
        do{
            validador = 0;
            System.out.print("Operação: ");
            operacao = entrada.nextLine().toUpperCase();
            switch (operacao)
            {
                case "ARITMETICA":
                    for (int i = 0; i < quantidadeN; i++) {
                        media += valores.get(i);
                    }
                    System.out.println("\nO valores inserirodos foram: ");
                    System.out.println(valores);
                    System.out.printf("Média ARITMETICA: %f", media/quantidadeN);
                    break;
                case "HARMONICA":
                    for (int i = 0; i < quantidadeN; i++) {
                        media += 1.0/valores.get(i);
                    }
                    System.out.println("\nO valores inserirodos foram: ");
                    System.out.println(valores);
                    System.out.printf("Média HARMONICA: %f", quantidadeN/media);
                    break;
                default:
                    System.out.println("Operação inválida, tente novamente");
                    validador = 1;
                    break;
            }
        }while (validador != 0);

        System.out.println("\n\nFim da execução");
    }

    public static int getNumberInt() {
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
            if(Integer.parseInt(texto) > 0)
            {
                return true;
            }else
            {
                System.out.println("O número tem que ser maior que zero, tente novamente");
                return false;
            }
        } catch (Exception e) {
            System.out.println("O número digitado não é inteiro (ou é muito grande), tente novamente");
            return false;
        }
    }

    public static double getNumberDouble(int i) {
        Scanner entrada = new Scanner(System.in);
        String numero;
        do {
            System.out.printf("Digite o %d° valor: ", i);
            numero = entrada.nextLine();
        } while (!eDouble(numero));

        return Double.parseDouble(numero);
    }

    public static boolean eDouble(String texto) {
        try {
            Double.parseDouble(texto);
            return true;
        } catch (Exception e) {
            System.out.println("O número digitado não é real (ou é muito grande), tente novamente");
            return false;
        }
    }
}