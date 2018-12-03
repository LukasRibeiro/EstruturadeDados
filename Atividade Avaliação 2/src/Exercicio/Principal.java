package br.com.fatec;

import javax.sound.midi.Sequence;
import javax.swing.JOptionPane;

public class Principal {

	static Sequencia sequencia;

	public static void main(String[] args) {
		String menu;

		do {
			menu = JOptionPane.showInputDialog("1 - Criar sequência\n" + "2 - Adicionar valor\n" + "3 - Imprimir");
			if (menu != null) {
				switch (menu) {
				case "1":
					criar();
					break;
				case "2":
					add();
					break;
				case "3":
					imprimir();
					break;
				}
			}

		} while (menu != null);
	}

	public static void criar() {
		String num = JOptionPane.showInputDialog("Entre com a quantidade: ");
		if (sequencia == null)
			sequencia = new Sequence(Integer.valueOf(num));
		else {
			sequencia.Resize(Sequence.count);
		}

	}

	public static void add() {
		if (sequencia != null) {
			String valor = JOptionPane.showInputDialog("Insira um valor: ");
			int valorn = Integer.parseInt(valor);
		} else
			JOptionPane.showMessageDialog(null, "É necessário criar a sequencia");
	}

	public static void imprimir() {
		if (sequencia == null) {
			JOptionPane.showMessageDialog(null, "É necessário criar a sequencia");
		} else
			sequencia.imprimir();
	}
}
