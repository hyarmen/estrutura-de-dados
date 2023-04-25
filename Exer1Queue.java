package Estrutura;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;

public class Exer1Queue {

	    public static void main(String[] args) {
	        Scanner leia = new Scanner(System.in);


	        Queue<String> fila = new LinkedList<>();
	        int i=1;
	        String nome;

	        do {
	        	System.out.print("""
		                \n **********************************************
		                        1 - Adicionar Cliente Na Fila        \s
		                        2 - Listar Todos Clientes             \s
		                        3 - Retirar Cliente da Fila           \s
		                        0 - Sair                              \s
		                *************************************************
		                Entre com a opção desejada:""");
		        i = leia.nextInt();
		        leia.nextLine();

		        switch (i){
		            case 1:
		                System.out.println("Digite o nome: ");
		                nome = leia.nextLine();
		                fila.add(nome);
		                fila.forEach(System.out::println);
		                System.out.println("\nCliente adicionado!");
		                break;
		            case 2:
		                if(fila.isEmpty()){
		                    System.out.println("A Fila está vazia!");
		                } else {
		                	System.out.println("\nLista de clientes na fila: ");
		                	fila.forEach(System.out::println);
		                }
		                break;
		            case 3:
		                if(fila.isEmpty()){
		                    System.out.println("A Fila está vazia!");
		                } else {
		                    fila.remove();
		                    System.out.println("\nFila: ");
		                    fila.forEach(System.out::println);
		                    System.out.println("\nO Cliente foi Chamado!");
		                }
		                break;
		            case 0:
		                System.out.println("Programa Finalizado!");
		                break;
		            default:
		                System.out.println("Selecione uma opção válida!");
		        } 
	        } while(i!=0);
	    }
	}
