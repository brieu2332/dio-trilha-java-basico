import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        try {
            System.out.print("Seu PRIMEIRO número: ");
            int primeiro = leia.nextInt();

            System.out.print("Seu SEGUNDO número: ");
            int segundo = leia.nextInt();

            contar(primeiro, segundo);
        } catch (InputMismatchException e) {
            System.out.println("Coloque valores inteiros válidos.");
        } catch (ParametrosInvalidosException exception) {
            System.out.println(exception.getMessage());
        }
    }

    static void contar(int primeiro, int segundo) throws ParametrosInvalidosException {
        if (primeiro >= segundo) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
        }

        int contagem = segundo - primeiro;
        for (int contador = 1; contador <= contagem; contador++) {
            System.out.println("Imprimindo número " + contador);
        }
    }
}

class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String mensagem) {
        super(mensagem);
    }
}