package fabricaBolo;

public class FabricaBoloBaunilhaComMorango {
	public void prepararBolo() {
		fazerMassa();
		levarAoForno();
		fazerCobertura();
		decorarBolo();
	}
	private void levarAoForno() {
		System.out.println("Leva ao forno");
	}
	private void fazerCobertura() {
		System.out.println("Faz cobertura de morango");
	}
	private void fazerMassa() {
		System.out.println("Faz a massa de baunilha");
	}
	private void decorarBolo() {
		System.out.println("Decora bolo");
	}
}