package demo;


	class M1 extends Thread {
		Synchro s;

		M1(Synchro s) {
			this.s = s;
			start();
		}

		public void run() {
			s.deposit(1000);

		}

	}

	class M2 extends Thread {
		Synchro s;

		M2(Synchro s) {
			this.s = s;
			start();

		}

		public void run() {
			s.deposit(900);

		}

	}

	public class Synchro {
		int bal = 500;

		synchronized void deposit(int amt) {

			int temp = bal;
			temp = temp + amt;
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
			bal = temp;
			System.out.println("  Account Balance= " + bal);

		}

		public static void main(String args[]) {
			Synchro s = new Synchro();
			M1 m = new M1(s);

			M2 m1 = new M2(s);

		}

}
