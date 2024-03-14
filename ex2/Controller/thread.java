package Controller;

public class thread extends Thread{
	private int[]linha;
	private int n;
	public thread(int [] linha, int n) {
		this.linha = linha;
		this.n = n;
	}
	@Override
	public void run() {
		int soma = 0;
		for (int i : linha) {
			soma = soma + i;
		}
		System.out.println();
		System.out.println(getId() + " - Linha " + n + ": Soma = " + soma);
		super.run();
	}

}
