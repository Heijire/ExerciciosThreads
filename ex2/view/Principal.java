package view;
import Controller.thread;
public class Principal {
	public static void main(String[] args) {
		int matriz[][] = new int [3][5];
		for(int i = 0; i < 3; i++) {
			System.out.println();
			for(int j = 0; j < 5; j++) {
				matriz[i][j] = (int) (Math.random()*100)+1;
			System.out.print(matriz[i][j] + " " );
			}
		}
		for (int linha = 0; linha <3; linha++) {
			
			Thread lin = new thread(matriz[linha], linha );
			lin.start();
		}
	}
}