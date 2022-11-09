package poo3;
import java.util.Scanner;

public class POO3 {

    public static void main(String[] args) {
        /*Fazer programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas
efetuadas por ele no mês (em dinheiro). Sabendo que esse vendedor ganha 20% de
comissão sobre suas vendas efetuadas, faça que o algoritmo informe o seu nome, o salário
fixo e salário no final do mês.*/
        
        String nome;
        int qtdVenda;
        double salario, comissao,salarioFinal;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("...:::Início do Programa:::...");
        System.out.println("\n----- Informações --------");
        
        System.out.println("\nNome do Vendedor: ");
        nome = entrada.next();
        
        System.out.println("\nSalário: ");
        salario = entrada.nextDouble();
        
        System.out.println("Quantidade de vendas:");
        qtdVenda = entrada.nextInt();
        
        comissao=salario*(0.20*qtdVenda);
        salarioFinal = salario+comissao;
        
        System.out.println("\nNome do Vendedor: " + nome);
        System.out.println("Salário fixo: " + salario);
        System.out.println("Sálario final: " + salarioFinal);
    }
    
}
