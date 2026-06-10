import java.util.Scanner;

public class exercicio3 {
     public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a sua velocidade: ");
        double km = scanner.nextDouble();

        if(km >= 80){
            System.out.println("Você foi multado!");
        } else {
            System.out.println("Boa viagem!");
        }
        }
    
    }
