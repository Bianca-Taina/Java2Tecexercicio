import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor total da compra: R$ ");
        double valor = scanner.nextDouble();

        double desconto;

        if (valor > 200) {
            desconto = 0.20; 
        } else if (valor > 100) {
            desconto = 0.10; 
        } else {
            desconto = 0.0; 
        }

        double valorFinal = valor * (1 - desconto);

        System.out.println("Desconto aplicado: " + (desconto * 100) + "%");
        System.out.printf("Valor final: R$ %.2f%n", valorFinal);

        scanner.close();
    }
}