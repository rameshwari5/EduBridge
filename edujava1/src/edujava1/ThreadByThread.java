package edujava1;

public class ThreadByThread  extends  Thread{
	String name;
	int time;
	
		
	
 public ThreadByThread(String name, int time) {
	 
		// TODO Auto-generated constructor stub
	 this.name=name;
		this.time=time;
		start();
		
	}


public void run() {
	 for(int i=10;i<15;i++)
	 {
		 System.out.println(name+"......."+i);
		 System.out.println(getName()+"............"+i);
		 try {
			 
			sleep(time);
			 
		 }
		 catch(InterruptedException e)
		 {
			 e.printStackTrace();
		 }
	 }
 }
 
}

