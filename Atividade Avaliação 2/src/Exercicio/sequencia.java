package br.com.fatec;

public class sequencia {

		int []vetor;
		int posicao = 0;
		int count;
		
		public void Sequencia (int tamanho) {
			if (tamanho < 5)
				tamanho = 5;
			count = tamanho;
			vetor = new int[tamanho];
			}
		
		public boolean add(int nro) {
			if (posicao < count) {
				vetor[posicao] = nro;
				posicao++;
				return true;
			}
			else {
				return false;
			}
		}
		
		
		public void Resize(int tamanho) {
			int soma = tamanho;
			if (tamanho < 5)
				soma = 5;
			count += soma;
			
			int[] vetor2 = new int[count];
			for (int i = 0; i < count - tamanho; i++) {
				vetor2[i] = vetor[i];
			}
			vetor = new int[count];
			vetor = vetor2;	
			
		}
		
		public void imprimir() {
			for( int i = 0; i < count;  i++) {
				System.out.println(vetor[i] = i);
			}
		}
	}
