package aula03;

class Retangulo {
	private String cor;
	private double lado1, lado2;
	private Ponto p;
	public Retangulo (String cor, Ponto p, double lado1, double lado2) {
		this.cor = cor;
		this.p = p;
		this.lado1 = lado1;
		this.lado2 = lado2;
	}
	public static double area (double lado1, double lado2) {
		return lado1*lado2;
	}
	public static double perimetro (double lado1, double lado2) {
		return (2*lado1)+(2*lado2);
	}
	public void voidArea () {
		System.out.println(area(lado1, lado2));
	}
	public void voidPerimetro () {
		System.out.println(perimetro(lado1, lado2));
	}
	public String toString () {
		return "RETANGULO -> Cor: " + this.cor + ", lado1: " + this.lado1  + ", lado2: " + this.lado2 + ", centro: (" + this.p.x + "," + this.p.y + ");";
	}
}
