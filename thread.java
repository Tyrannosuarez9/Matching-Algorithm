
public class thread extends Thread {
	int postID = 0;

	public thread(int id) {
		postID = id;
	}

	testing tester = new testing();

	public void run() {
		for (int x = 0; x <= 1; x++) {
			if (tester.testing(x)) {
				System.out.println(postID);
				Thread.currentThread().interrupt();
			}
			else {
				System.out.println("sleeping on " + postID);
				try {
					Thread.sleep(30000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("waking on " + postID);
				
			}
		}
	}
}
