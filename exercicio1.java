import java.util.Scanner;

public class exercicio1 {
        public static void main(String[] args){
             Scanner scanner = new Scanner(System.in);

        System.out.println("Digite quantos anos você tem: ");
        double  idade = scanner.nextDouble();

        if(idade >= 18){
            System.out.println("Já é de maior, já pode ser presso");
        } else {
            System.out.println("é menor de idade");
        }
        }
    
    }
