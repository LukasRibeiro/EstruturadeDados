package Exercicios;

public class Ponto {
	int x, y;
	double d;

	Ponto(){
		this.x = (int) (Math.random()*10+1);
		this.y = (int) (Math.random()*10+1);
	}

	double distancia() {
		double dx = Math.pow(x, 2);
		double dy = Math.pow(y, 2);
		d = Math.sqrt(dx + dy);

		return d;
	}

	void imprimir() {
		if (d > 4)
			System.out.println("(" + x + "," + y +")");

	}
	void imprimirSoma() {
		if (d > 4)
			System.out.printf("Soma distância: %d\n", x+y);
	}
}
