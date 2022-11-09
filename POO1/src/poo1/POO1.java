package poo1;
import java.util.Scanner;

public class POO1 {

    public static void main(String[] args) {
        /*Fazer programa que calcule o valor da área de um triangulo, a partir do valor da base e
altura.*/
        
        double base, altura, area;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("...:::Início do Programa:::...");
        System.out.println("\nDigite o valor da base do triângulo(m): ");
        base = entrada.nextDouble();
        
        System.out.println("Digite o valor da altura do triângulo(m): ");
        altura = entrada.nextDouble();
        
        area = (base*altura)/2;
        
        System.out.println("\nÁrea do triângulo: " + area + "m²");
    }
    
}
