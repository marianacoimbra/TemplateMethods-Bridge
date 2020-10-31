package fabricaBolo;

public class FabricaBoloChocolateComCaramelo {
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
		System.out.println("Faz cobertura de caramelo");
	}
	private void fazerMassa() {
		System.out.println("Faz a massa de chocolate");
	}
	private void decorarBolo() {
		System.out.println("Decora bolo");
	}
}