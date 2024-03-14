package Controller;

public class ThreadVetor extends Thread {
	private int numero;
	private int[] vet;
	public ThreadVetor(int numero, int[] vet) {
		this.vet = vet;
		this.numero = numero;
	}
	

	@Override
	public void run() {

		if(numero% 2 == 0) {
			double tempoinicial = System.nanoTime();
			for (int i = 0 ; i < vet.length; i++) {
				vet[i] = 0;
			}
			double tempofinal = System.nanoTime();
			double tempototal = tempofinal - tempoinicial;
			tempototal = tempototal / Math.pow(10, 9);
			System.out.println("Thread Id[#" + getId() + "] - " + numero + ", par dura " + tempototal  + " segundos usando for" );
		} else {
			double tempoinicial = System.nanoTime();
			for(int i: vet) {
				vet[i] = 0;
			}
			double tempofinal = System.nanoTime();
			double tempototal = tempofinal - tempoinicial;
			tempototal = tempototal / Math.pow(10, 9);
			System.out.println("Thread Id[#" + getId() + "] - " + numero + ", impar dura " + tempototal  + " segundos usuando foreach" );
		}
		super.run();
	}
}