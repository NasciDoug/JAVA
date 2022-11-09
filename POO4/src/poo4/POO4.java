package poo4;
import java.util.Scanner;

public class POO4 {

    public static void main(String[] args) {
        /*Fazer programa que leia o nome de um aluno e as notas das três provas que ele obteve no
semestre, com pesos 2, 4 e 6. No final, deve-se informar o nome do aluno e a sua média
ponderada.*/
        
        String nome;
        double nota1, nota2, nota3, media;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("...:::Início do Programa:::...");
        
        System.out.print("\n------ Informações Aluno -----");
        System.out.print("\nDigite o nome do aluno: ");
        nome = entrada.next();
        
        System.out.print("Digite a nota da N1: ");
        nota1 = entrada.nextDouble();
        System.out.print("Digite a nota da N2: ");
        nota2 = entrada.nextDouble();
        System.out.print("Digite a nota da N3: ");
        nota3 = entrada.nextDouble();
        
        media=(nota1*2+nota2*4+nota3*6)/12;
        
        System.out.print("\nAluno: " + nome);
        System.out.print("Média: " + media);
    }
    
}
