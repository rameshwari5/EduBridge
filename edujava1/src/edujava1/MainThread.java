package edujava1;



public class MainThread  {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		new ThreadByThread("ONE",3000);
		new ThreadByThread("Two",2000);
		new ThreadByThread("Three",1000);
	}

}
