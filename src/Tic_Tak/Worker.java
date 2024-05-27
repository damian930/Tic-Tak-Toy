package Tic_Tak;

public class Worker extends Thread {
	private final Data data;
	
	public Worker(Data d) {
		this.data = d;
		this.start();
	}
	
	@Override
	public void run() {
		super.run();
		for (int i=0; i<5; i++) {
			synchronized (this.data) {
				if (this.data.getState() == 1)
					this.data.Tic();
				else
					this.data.Tak();
			}
		}
	}
}
	

