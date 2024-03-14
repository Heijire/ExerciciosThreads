package view;
import Controller.ThreadId;

public class main {
	   public static void main( String[] args) {
		for (int id = 0; id < 5; id++) {
			Thread Id = new ThreadId(id);
			Id.start();
		}
	}
}
