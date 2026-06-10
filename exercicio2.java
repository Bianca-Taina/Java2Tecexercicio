import java.util.Scanner;

public class exercicio2 {
     public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a sua senha: ");
        double senhadigitada = scanner.nextDouble();
        double senhafixa = 4321;
        if (senhadigitada == senhafixa){
            System.out.println("Acesso permitido: "); 
        } else{
            System.out.println("Acesso negado: ");
        }
    }
}
