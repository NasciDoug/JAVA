package poo7;
import java.util.Scanner;

public class POO7 {

    public static void main(String[] args) {
        /*Fazer programa que receba três inteiros e mostre qual deles é o maior e qual o menor.*/
        
        double num1, num2, num3;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("...:::Início do Programa:::..");
        
        System.out.println("Digite o valor do primeiro número: ");
        num1 = entrada.nextDouble();
        System.out.println("Digite o valor do segundo número: ");
        num2 = entrada.nextDouble();
        System.out.println("Digite o valor do terceiro número: ");
        num3 = entrada.nextDouble();
        
        if(num1>num2){
            if(num1>num3){
                System.out.println(num1 + " é o maior número digitado!!");
            }
            else
                System.out.println(num3 + " é o maior número digitado!!");
        }else if (num2>num3)
            System.out.println(num2 + " é o maior número digitado!!");
        else 
            System.out.println(num3 + " é o maior número digitado!!");
    }
    
}
