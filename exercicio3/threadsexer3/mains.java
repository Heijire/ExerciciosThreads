package threadsexer3;

import Controller.ThreadVetor;
public class mains {
	public static void main(String[]args) {
		 int[] vet = new int[10000];
		   for(int i = 0; i < 10000; i++) {
			   vet[i] = (int) (Math.random()*100)+1;
		   }
		   for(int a = 1; a <3; a++) {
			   Thread vt = new ThreadVetor(a, vet);
			   vt.start();
		   }
	}
}
