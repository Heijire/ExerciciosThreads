package Controller;
public class threadspula extends Thread {
	private int distancia;
	private int tamanhomax;
	private int sapo;
	public threadspula (int distancia, int tamanhomax, int sapo) {
		this.distancia = distancia;
		this.tamanhomax = tamanhomax;
		this.sapo = sapo;
	}
	@Override
	public void run() {
		int percorre = 0;
		int pulo= 0;
		while (percorre < distancia) {
			pulo = (int) (Math.random()*tamanhomax);
			percorre = percorre + pulo; 
			if(percorre > distancia) {
				percorre = distancia;
			}
			System.out.println("Thread Id#["+ getId() + "]-O sapo de numero " + (sapo+1) + " pulou " + pulo + " metros e percorreu " + percorre + " metros.");
			if(percorre == distancia){
				System.out.println("Thread Id#[" + getId() + "] O sapo de numero " + (sapo+1) + " chegou no final.");
				}
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		super.run();
	}
}
