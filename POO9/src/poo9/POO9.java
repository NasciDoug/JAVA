package poo9;
import java.util.Scanner;

public class POO9 {

    public static void main(String[] args) {
        /*Fazer programa que receba um número inteiro do usuário e diga se ele é ou não múltiplo
de 5.*/
        int num;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("...:::Início do Programa:::...");
        
        System.out.print("Digite um número: ");
        num = entrada.nextInt();
        
        if(num%5==0)
            System.out.println("O número digitado é múltiplo de 5!!");
        else
            System.out.println("O número digitado não é múltiplo de 5!!");
    }
    
}
