package threadsexer4;
import javax.swing.JOptionPane;
import Controller.threadspula;
public class erros {
	public static void main( String[] args) {
		int tamanhocorrida;
		int pulomax;
		tamanhocorrida = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho da corrida desejado em metros."));
		pulomax = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho maximo que o pulo pode ser realizado. "));
		pulomax = pulomax+1;
		for(int i = 0 ; i< 5; i++) {
			Thread pula = new threadspula(tamanhocorrida, pulomax, i);
			pula.start();
		}
	}
}
