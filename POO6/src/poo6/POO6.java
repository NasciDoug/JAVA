package poo6;
import java.util.Scanner;
public class POO6 {

    public static void main(String[] args) {
        /*Fazer programa que receba um número e diga se ele está no intervalo entre 100 e 200.*/
        
        double num;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("...:::Início do Programa:::...");
        System.out.println("Digite um número: ");
        num = entrada.nextDouble();
        
        if (num>100 && num<200)
            System.out.println("O número digitado está dentro do intervalo!!");
        else
            System.out.println("O número digitado está fora do intervalo!!");
    }   
    
}
