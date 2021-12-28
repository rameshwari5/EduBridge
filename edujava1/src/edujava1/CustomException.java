package edujava1;

public class CustomException  extends Exception {

	public CustomException(String name) {
		// TODO Auto-generated method stub
        super(name);
        System.out.println(name);
	}

}
