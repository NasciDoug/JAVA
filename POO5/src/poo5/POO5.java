package poo5;
import java.util.Scanner;

public class POO5 {

    public static void main(String[] args) {
        /*Fazer programa que calcula a tensão elétrica (em Volts - v) onde o usuário entra com o valor da
corrente elétrica (em Amperes - i) e o valor da resistência (em Ohms - r).*/
        
        double r, i, v;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("...:::Início do Programa:::...");
        
        System.out.print("Digite o valor da corrente elétrica (Amperes): ");
        i = entrada.nextDouble();
        
        System.out.print("Digite o valor da resistência (Ohms): ");
        r = entrada.nextDouble();
        
        v = r*i;
        
        System.out.println("Tensão (V = R*I): " + v + "V");
    }
    
}
