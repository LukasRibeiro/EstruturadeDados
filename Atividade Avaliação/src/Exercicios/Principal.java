package Exercicios;

import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		String menu;
		int x = 0;
		int soma = 0;
		int [] vetor  = new int[10];
		int [] vetor2 = new int[10];
		int [] vetor4 = new int[10];
		int [] vetor5 = new int[10];


		do{
			menu = JOptionPane.showInputDialog(
					"1 - Criar Array\n"+
							"2 - Imprimir na ordem normal\n"+
							"3 - Imprimir na ordem invertida\n" +
							"4 - Imprimir os elementos em posições pares\n"+
							"5 - Imprimir os elementos pares\n "+
							"6 - Imprimir o somatório\n" +
							"7 - Imprimir Elentos com distância até a origem > 4\n"+
							"8 - Somatório das distâncias dos pontos até a origem\n"+
					"9 - Fechar Menu");
			
			if (menu != null) {
				switch (menu) {
				
				case "1" : System.out.println("1");
				for (x=0; x<vetor.length; x++) {
					vetor[x] = x;
				}
				break;

				case "2" : System.out.println("2");
				for (x=0; x<vetor.length; x++) {
					vetor[x] = x;
					System.out.printf("Lista: %d\n", vetor[x]);
				}

				break;

				case "3" : System.out.println("3");
				for (x=vetor.length - 1; x >= 0; x--) {
					vetor2[x] = x;
					System.out.printf("Lista na ordem inversa: %d\n", vetor2[x]);	
				}

				break;

				case "4" : System.out.println("4");
				for (x=0; x<vetor.length; x++) {
					if(x % 2==0)

						System.out.printf("Posições pares: %d\n ", x);
				}

				break;

				case "5" : System.out.println("5");
				for (x=0; x<vetor.length; x++) {
					vetor[x] = x;	
					if(vetor[x] % 2 == 00) {
						vetor4[x] = x;
						System.out.printf("Números Pares: %d\n",vetor4[x]);
					}
				}
				break;

				case "6" : System.out.println("6");
				for (x=0; x<vetor.length; x++) {
					soma += x;

					System.out.printf("Soma: %d\n",soma);

				}
				break;

				case "7" : System.out.println("7");
				for (x=0; x<vetor.length; x++) {
					Ponto p = new Ponto();
					vetor5[x] = x;
					p.distancia();	
					p.imprimir();

				}
				break;

				case "8" : System.out.println("8");
				for (x=0; x<vetor5.length; x++) {
					Ponto p = new Ponto();
					p.distancia();	
					p.imprimirSoma();
				}

				case "9" : System.out.println("9");
				menu = null;
				}

			}
		}while (menu != null);
	}
}
