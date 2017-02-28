package aula03;

class Circulo {
	private String cor;
	private double raio;
	private Ponto p;
	public Circulo (String cor, Ponto p, double raio) {
		this.cor = cor;
		this.p = p;
		this.raio = raio;
	}
	public static double area (double raio) {
		return Math.pow(raio, 2)*Math.PI;
	}
	public static double perimetro (double raio) {
		return 2*Math.PI*raio;
	}
	public void voidArea () {
		System.out.println(area(raio));
	}
	public void voidPerimetro () {
		System.out.println(perimetro(raio));
	}
	public double voidPontoX () {
		return p.x;
	}
	public double voidPontoY () {
		return p.y;
	}
	public double voidRaio () {
		return raio;
	}
	public boolean verificarCir (Circulo c) {
		double raioMaior;
		if (c.voidRaio() > voidRaio()) raioMaior = c.voidRaio();
		else raioMaior = voidRaio();
		if(Math.sqrt(Math.pow(c.voidPontoX()-voidPontoX(),2)+Math.pow(c.voidPontoY()-voidPontoY(),2)) <= raioMaior) return false;
		else return true;
	}
	public String toString () {
		return "CIRCULO -> Cor: " + this.cor + ", raio: " + this.raio + ", centro: (" + this.p.x + "," + this.p.y + ");";
	}
}
