package javaprograms;

public class BreakAndContinueDemo {

	public static void main(String[] args)
	{
		for(int i=1;i<=10;i++)
		{
			if(i==7) {
				break;  //Jump out of the loop
			}
			System.out.println(i);
		}
		System.out.println("Final statement");
	
	
	for(int j=1;j<=10;j++)
	{
		if(j==7) {
			continue; //Skip the current cycle and continue with next cycles.
		}
		System.out.println(j);
	}
	System.out.println("Final statement");
}
}
