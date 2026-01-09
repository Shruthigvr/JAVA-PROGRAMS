package javaprograms;

public class DoWhileLoopDemo {

	public static void main(String[] args) {
		// Do-while is used when we want to execute the code atleast once irrespective of the condition
		int i=1;
		do
		{		
			System.out.println(i);
			i++;
		} while(i<=10);
		
		System.out.println("Outside do-while loop");
		
		while(i>10) {
			System.out.println("Inside while loop");
		}
		System.out.println("Outside while loop");

	}

}
