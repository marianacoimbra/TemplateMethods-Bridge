package fabricaBoloRefactored;

public abstract class PrepararBolo {

	public Cobertura cobertura;

	public void prepararBolo() {
		fazerMassa();
		levarAoForno();
		cobertura.fazerCobertura();
		decorarBolo();
	}

	public void morango() {
		this.cobertura = new Morango();
	}

	public void caramelo() {
		this.cobertura = new Caramelo();
	}

	private void levarAoForno() {
		System.out.println("Leva ao forno");
	}

	public abstract void fazerMassa();

	private void decorarBolo() {
		System.out.println("Decora bolo");
	}
}
