package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);//para ficar "." como separador decimal
		Scanner entrada = new Scanner(System.in);
		
		Account conta;
		
		System.out.println("Digite o numero da conta: ");
		int numero = entrada.nextInt();
		
		System.out.print("Digite o nome do títular: ");
		entrada.nextLine();
		String nome = entrada.nextLine();
		
		System.out.print("Tem depósito inicial (y/n) ?");
		char reposta = entrada.next().charAt(0);
		
		if(reposta == 'y') {
			System.out.print("Digite o valor do deposito inicial: ");
			double depositoInicial = entrada.nextDouble();
			conta = new Account(numero, nome, depositoInicial);
		}
		else {
			conta = new Account(numero, nome);
		}
		
		System.out.println();
		System.out.println("Dados da conta: ");
		System.out.println(conta);
		
		System.out.println();
		System.out.println("Digite o valor para depósito: ");
		double valorDeposito = entrada.nextDouble();
		conta.depositar(valorDeposito);
		System.out.println("Dados da conta atualizada: ");
		System.out.println(conta);
		
		System.out.println();
		System.out.println("Digite o valor para saque: ");
		double valorSaque = entrada.nextDouble();
		conta.sacar(valorSaque);
		System.out.println("Dados da conta atualizada: ");
		System.out.println(conta);
		
		
		
		
		
		
		entrada.close();
	}

}
