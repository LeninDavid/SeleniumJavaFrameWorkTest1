package Quantinsti;

public class JavaTest {

	public static void main(String[] args) {
		int x=0;
		System.out.println("Numbers divisible by 3 or 5 under 1000 is");
		for(int i=1; i<1000; i++)
		{
			if(i%3==0||i%5==0)
			{	
			System.out.print(i+" ");	
			x=x+i;
			}
		}
		System.out.println("\nThe sum of multiples of all the values is divisible by 3 or 5 under 1000 is "+ x);
	}
	

}
