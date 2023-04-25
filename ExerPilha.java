package Estrutura;

import java.util.Scanner;
import java.util.Stack;

public class ExerPilha {

	public static void main(String[] args) {
		int i = 0;
		String livro;
		Scanner leia = new Scanner(System.in);
		Stack<String> pilhaDeLivros = new Stack<>();
		
		do {
			System.out.print("""
	                \n **********************************************
	                        1 - Adicionar Livros                  \s
	                        2 - Listar Todos os Livros            \s
	                        3 - Retirar um Livro                  \s
	                        0 - Sair                              \s
	                *************************************************
	                Entre com a opção desejada:""");
	        i = leia.nextInt();
	        leia.nextLine();
	        
	        switch (i){
            case 1:
                System.out.println("Digite o título do livro que deseja adicionar: ");
                livro = leia.nextLine();
                pilhaDeLivros.add(livro);
                System.out.printf("Livro %S adicionado com sucesso!\n", livro);
				System.out.println("Aperte Enter para voltar ao Menu");
				leia.nextLine();
                break;
            case 2:
                if(pilhaDeLivros.isEmpty()){
                    System.out.println("Não tem livros na pilha!");
                    System.out.println("Aperte Enter para voltar ao Menu");
    				leia.nextLine();
                } else {
                	System.out.println("\nLista de clientes na fila: ");
                	pilhaDeLivros.forEach(System.out::println);
                	System.out.println("Aperte Enter para voltar ao Menu");
    				leia.nextLine();
                }
                break;
            case 3:
				System.out.println("Qual livro deseja retirar da estante?");
				String retirarLivro = leia.nextLine();
				
				if(pilhaDeLivros.contains(retirarLivro)) {
					pilhaDeLivros.remove(retirarLivro);
					System.out.printf("Livro %S removido!\n", retirarLivro);
					System.out.println("Aperte Enter para voltar ao Menu");
					leia.nextLine();
				}else {
					System.out.println("Esse título não consta na estante para ser removido!");
					System.out.println("Aperte Enter para voltar ao Menu");
					leia.nextLine();
				}
                break;
            case 0:
                System.out.println("Programa Finalizado, boa leitura!");
                break;
            default:
                System.out.println("Selecione uma opção válida!");
	        } 
		} while(i!=0);

	}

}
