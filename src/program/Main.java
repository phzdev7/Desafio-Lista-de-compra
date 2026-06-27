package program;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		ArrayList<Item> itens = new ArrayList<>();
		 
		while(true) {
		
		char escolha;
		
		
		System.out.println("\n---------------------------");
		System.out.println("\n===== Mercado do Ph =====");
		System.out.println("\n------------------------");
		System.out.println("| 1 - Adicionar itens  |");;
		System.out.println("| 2 - Alterar Preço    |");
		System.out.println("| 3 - Remover item     |");
		System.out.println("| 4 - limpar o carrinho|");
		System.out.println("| 0 - Sair             |");
		System.out.println("------------------------");
		   
		 System.out.print("\nDigite: ");
		 escolha = sc.next().charAt(0);
		 System.out.println("\n----------------------------------------------------------------------------------------------");

		 
		
		 	if(escolha == '1') {
		 		
		 		System.out.println("\n              === Adicionar item ===");
		 		int n = 20;
		 		
		 		while(true) {
		 	
		 		System.out.println("\n *** Caso esteja na opção errada digite '0' ***");
		 		System.out.print("\nDigite a quantidade de itens (Possivel apenas até 20 itens): ");
		 		
		 		n = sc.nextInt();
		 		
		 		
		 			if (n > 20) {
		 				
		 				System.out.println("\nSó pode adicionar até 20 itens");
		 					continue; }
		 			else {
		 					break;
		 			}
		 		}
		 	for (int i =0; i<n; i++) {
		 		
		 		//AQUI O USER GUARDA O PRIMEIRO ITEM EM UM ARRAY, JUNTO COM NOME E PREÇO
		 		
		 		System.out.println("----------------------------------------------------------------------------------------");
		 		System.out.print("\nItem: ");  //NOME
		 		String nome = sc.next();
		 		
		 		System.out.print("Preço: R$"); //PREÇO
		 		double preco = sc.nextDouble();
		 		
		 		itens.add(new Item(nome,preco));
		 		
		 			double total = 0;
		 			for (Item  I : itens) {
		 				total += I.preco;
		 			}
		 			System.out.println("Total da compra Atualizado: R$" + total);
		 	}
		 }
		
		 	
		 	else if (escolha == '2') {
		 
		 		for (int i = 0; i < itens.size(); i++) {
		 			System.out.println((i + 1) + " - " + itens.get(i));
		 		}
		 		
		 			while(true){
		 			
		 			System.out.print("\nQual item deseja alterar: ");
		 			int opcao = sc.nextInt();
		 			
		 			System.out.print("Qual será o novo Preço: ");
		 			double newPrice = sc.nextDouble();
		 			
		 			itens.get(opcao - 1).setPreco(newPrice);
		 			
		 				double total = 0;
		 				for (Item i : itens) {
		 					total += i.getPreco();
		 				}
		 			
		 			System.out.print("\nTotal R$" + total);
		 			System.out.println(" ");
		 			System.out.println("\n*** Preço alterado com sucesso! ***");
		 			
		 			System.out.print("\n Deseja retirar um novo item? (s/n): ");
		 			char resposta = sc.next().charAt(0);
		 				if(resposta == 's' || resposta == 'S') {
		 					continue;
		 				}
		 				else if (resposta == 'N' || resposta == 'n') {
		 					break;
		 				}
		 			
		 		
		 			}	 		
		 	}
		 	
		 	
		 	
		 	
		 	
		 	else if (escolha == '4') {
		 		System.out.println("\n Carrinho limpo com sucesso!");
		 		itens.clear();
		 		continue;
		 	}
		 	
		 	else if(escolha == '0') {
		 		System.out.println("\n=== Volte sempre! ===");
		 		break;
		 	}
		 	
	}
		sc.close();
	}
}
