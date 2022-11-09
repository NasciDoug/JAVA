package poo8;
import java.util.Scanner;

public class POO8 {

    public static void main(String[] args) {
        /*Efetue a leitura de dois valores numéricos inteiros e apresente o resultado da diferença
do maior valor pelo menor.*/
        
        int num1, num2, subtr;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("...:::Início do Programa:::...");
        
        System.out.print("Digite o valor do primeiro número: ");
        num1 = entrada.nextInt();
        
        System.out.print("Digite o valor do segundo número: ");
        num2 = entrada.nextInt();
        
        if(num1>num2){
            subtr = num1-num2;
            System.out.println(num1 + "-" + num2 + " = " + subtr);
        }
        else{
            subtr = num2-num1;
            System.out.println(num2 + "-" + num1 + " = " + subtr);
        } 
            
    }
    
}
