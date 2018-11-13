
public class thread extends Thread {
	int postID = 0;
	Matching holder = new Matching();
	public thread(int id) {
		postID = id;
	}

	testing tester = new testing();

	public void run() {
		for (;;) {
			if (holder.Match(postID)) {
				System.out.println(postID);
				return;
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
