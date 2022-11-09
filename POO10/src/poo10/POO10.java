package poo10;
import java.util.Scanner;

public class POO10 {

    public static void main(String[] args) {
        /*Para doar sangue é necessário ter entre 18 e 67 anos. Elabore o programa que pergunte a
idade de uma pessoa e diga se ela pode doar sangue ou não. Use alguns dos operadores
lógicos OU (||) e E (&&).*/
        
        String nome;
        int idade;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("...:::Início do Programa:::...");
        
        System.out.print("\nNome do Doador: ");
        nome = entrada.next();
        
        System.out.print("Idade do doador: ");
        idade = entrada.nextInt();
        
        if(idade>18 && idade<67){
            System.out.println(nome);
            System.out.println("está APTO(A) para doar sangue");
        }
        else{
            System.out.println(nome);
            System.out.println("está INAPTO(A) para doar sangue");
        }
    }
    
}
