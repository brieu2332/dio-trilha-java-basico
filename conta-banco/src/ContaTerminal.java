import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        //variaveis
        int numero;
        String agencia = "";
        String nomeCliente = "";
        double saldo;

        Scanner ler = new Scanner(System.in);//scanner para ler variveis

        System.out.println("diga o numero inteiro:");
        numero = ler.nextInt();

        System.out.println("diga sua agência:");
        agencia = ler.next();//le string

        System.out.println("diga seu nome:");
        nomeCliente = ler.next();

        System.out.println("diga seu saldo:");
        saldo = ler.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agêcia é " 
        + agencia + ", conta " + numero + " e seu saldo " + saldo +  " já está disponivel para saque.");
    }
}
