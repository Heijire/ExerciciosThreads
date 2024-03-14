package Controller;
public class ThreadId extends Thread{
	private int id;
	public ThreadId(int idThread) {
		this.id = idThread;
	}
	@Override
	public void run() {
		
		System.out.println(id);
		super.run();
	}
}