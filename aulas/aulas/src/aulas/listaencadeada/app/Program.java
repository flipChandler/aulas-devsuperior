package aulas.listaencadeada.app;

import java.util.Locale;
import java.util.Scanner;

import aulas.listaencadeada.util.List;

public class Program {

	public static void main(String[] args) {
		/*
		 * Lista encadeada é uma estrutura de dados que armazena os valores em uma sequência de nós
		 * Cada nó conhece seu nó sucessor (ou antecessor se for uma lista duplamente encadeada.)
		 * Tem-se a noção de posição nas listas
		 * nó: pode guardar valor e também referências para outros nós, dependendo da estrutura
		 * Conceitos:
		 * 		Cabeça: primeiro elemento da lista
		 * 		Cauda: lista sem o primeir elemento
		 * 
		 * Complexidade:
		 * 		Busca: O(N) -> no pior caso, pode ter que buscar n elementos da lista
		 * 		Inserção: depende
		 * 		Remoção: depende
		 * 
		 * O array busca muito rápido, porém, pra inserir (no meio) precisa empurrar todos elementos
		 * A lista demora pra encontrar o elemento, porém, pra inserir e remover é mais rápido
		 * 
		 * 
		 * GENERICS: se utilizar Object como tipo do atributo, não tem Type Safety na lista
		 * porque aceita qualquer tipo, e pode ter um erro em tempo de execução, no casting 
		 * 
		 * O compilador verifica em tempo de compilação se a tipagem da lista está correta
		 */
		
		Scanner scanner = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		List<Double> list = new List<Double>();
		
		int option;
		do {
			showMenu();
			option = scanner.nextInt();
			
			switch (option) {
			case 1:
				System.out.print("Digite um número: ");
				double value = scanner.nextDouble();
				list.add(value);
				break;
			case 2:
				System.out.println(list);
				break;
			case 3:
				System.out.println("Fim do programa!");
				break;

			default:
				System.out.println("Opção inválida!");
			}
			
			
		}while(option != 3);		
		
		scanner.close();
	}
	
	public static void showMenu() {
		System.out.println("1 - Inserir elemento na lista");
		System.out.println("2 - Mostrar lista");
		System.out.println("3 - Sair\n");
	}
	

}
