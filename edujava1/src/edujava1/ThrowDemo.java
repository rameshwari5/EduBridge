package edujava1;

public class ThrowDemo {
	void age(int a) throws CustomException{
		if(a>18)
		{
			System.out.println("you can vote");
		}
		else {
			throw new CustomException("InvalidDataException");
		}
	}

	public static void main(String[] args) throws CustomException {
		// TODO Auto-generated method stub
		ThrowDemo obj=new ThrowDemo();
		obj.age(12);

	}

}
