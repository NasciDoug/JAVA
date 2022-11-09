package poo2;
import java.util.Scanner;

public class POO2 {

    public static void main(String[] args) {
        /*Fazer programa que receba dois números e mostre a soma, a subtração, a multiplicação e a
divisão dos números.*/
        
        double num1, num2, soma, subtr, div, mult;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número: ");
        num1 = entrada.nextDouble();
        
        System.out.println("Digite o segundo número: ");
        num2 = entrada.nextDouble();
        
        soma = num1+num2;
        subtr = num1-num2;
        div = num1/num2;
        mult = num1*num2;
        
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtr);
        System.out.println("Divisão: " + div);
        System.out.println("Multiplicação: " + mult);
    }
    
}
