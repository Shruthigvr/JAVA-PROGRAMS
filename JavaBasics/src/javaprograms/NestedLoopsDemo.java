package javaprograms;

public class NestedLoopsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=1;i<=4;i++)
		{
			int j=1;
			while(j<=5)
			{
				for(int k=1;k<=2;k++)
				{
				System.out.println("The value of i : "+i+" and the value of j : "+j+" and the value of k : "+k);
				count++;
				}
				j++;
				
			}
		}
		System.out.println("Count is : "+count);

	}

}
