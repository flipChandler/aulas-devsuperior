package aulas.listaencadeada.app;

import java.util.Locale;
import java.util.Scanner;

import aulas.listaencadeada.util.List;

public class Program {

	public static void main(String[] args) {
		/*
		 * Lista encadeada � uma estrutura de dados que armazena os valores em uma sequ�ncia de n�s
		 * Cada n� conhece seu n� sucessor (ou antecessor se for uma lista duplamente encadeada.)
		 * Tem-se a no��o de posi��o nas listas
		 * n�: pode guardar valor e tamb�m refer�ncias para outros n�s, dependendo da estrutura
		 * Conceitos:
		 * 		Cabe�a: primeiro elemento da lista
		 * 		Cauda: lista sem o primeir elemento
		 * 
		 * Complexidade:
		 * 		Busca: O(N) -> no pior caso, pode ter que buscar n elementos da lista
		 * 		Inser��o: depende
		 * 		Remo��o: depende
		 * 
		 * O array busca muito r�pido, por�m, pra inserir (no meio) precisa empurrar todos elementos
		 * A lista demora pra encontrar o elemento, por�m, pra inserir e remover � mais r�pido
		 * 
		 * 
		 * GENERICS: se utilizar Object como tipo do atributo, n�o tem Type Safety na lista
		 * porque aceita qualquer tipo, e pode ter um erro em tempo de execu��o, no casting 
		 * 
		 * O compilador verifica em tempo de compila��o se a tipagem da lista est� correta
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
				System.out.print("Digite um n�mero: ");
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
				System.out.println("Op��o inv�lida!");
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
