package javaprograms;

import java.util.Scanner;

public class LargestOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter value for first number : ");
		a=sc.nextInt();
		
		System.out.println("Enter value for second number : ");
		b=sc.nextInt();
		
		System.out.println("Enter value for third number : ");
		c=sc.nextInt();
		
		if((a>=b) && (a>=c))
		{
			System.out.println("The largest number is : "+a);
		} else if((b>=a) && (b>=c))
		{
			System.out.println("The largest number is : "+b);
		} else if((c>=a) && (c>=b))
		{
			System.out.println("The largest number is : "+c);
		} 

	}

}
