package Exercicio;

public class Lista {
	No inicio;

	Lista() {
		inicio = null;
	}

	/* inserir no final da lista */
	void inserir(String nome) {
		/* cria um no */

		No no = new No();
		no.conteudo = nome;
		no.proximo = null; /* sera o ultimo No da lista */

		/* Checa se a lista esta vazia */
		if (inicio == null) {
			inicio = no;
		} else {
			/* Percorre a lista ate encontrar o ultimo No */
			No ultimo = inicio;
			while (ultimo.proximo != null) {
				ultimo = ultimo.proximo;
			}

			/* altera o proximo do ultimo para o endereço do No */
			ultimo.proximo = no;
		}
	}

	void imprimir() {
		/* checa se a lista esra vazia */
		if (inicio == null) {
			System.out.println("Lista vazia!");
		} else {
			/* percorre a lista ate encontrar o ultimo No */
			No ultimo = inicio;
			while (ultimo != null) {
				System.out.println(ultimo.conteudo + "");
				ultimo = ultimo.proximo;
			}
			System.out.println(); /* quebra a linha na tela */
		}
	}

	/* retorna a quantidade de elementos da lista */
	int size() {
		int cont = 0;
		/* percorre a lista ate encontrar o ultimo no */
		No ultimo = inicio;
		while (ultimo != null) {
			cont++;
			ultimo = ultimo.proximo;
		}
		return cont;
	}

	/* ordena os elementos da lista */
	void sort() {
		No a = inicio;
		No b = inicio.proximo;

		while (b != null) {
			int resultado = a.conteudo.compareToIgnoreCase(b.conteudo);
			if (resultado > 0) {
				String aux = a.conteudo;
				a.conteudo = b.conteudo;
				b.conteudo = aux;
				sort();
			}
			a = a.proximo;
			b = b.proximo;
		}
	}
}
