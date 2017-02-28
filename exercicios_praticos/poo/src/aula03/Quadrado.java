package aula03;

class Quadrado {
	private String cor;
	private double lado1;
	private Ponto p;
	public Quadrado (String cor, Ponto p, double lado1) {
		this.cor = cor;
		this.p = p;
		this.lado1 = lado1;
	}
	private static double area (double lado1) {
		return lado1*lado1;
	}
	private static double perimetro (double lado1) {
		return 4*lado1;
	}
	public void voidArea () {
		System.out.println(area(lado1));
	}
	public void voidPerimetro () {
		System.out.println(perimetro(lado1));
	}
	public String toString () {
		return "QUADRADO -> Cor: " + this.cor + ", lado: " + this.lado1 + ", centro: (" + this.p.x + "," + this.p.y + ");";
	}
}
