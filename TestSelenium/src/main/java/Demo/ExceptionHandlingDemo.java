package Demo;

import java.io.IOException;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {


		try {
			demo();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	 
	public static void demo() throws Exception
	{
		
			System.out.println("Hello World....!");
			throw new IOException("not valid operation");
			//int i=1/0;
			//System.out.println("Completed");

		
		
		
	}

}
