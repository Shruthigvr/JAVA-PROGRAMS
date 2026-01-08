package javaprograms;

public class OperatorsInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=50;
		int num2=30;
		String str = "Operators";
		
		//Concatenation
		System.out.println(num1+num2);
		System.out.println(str+num1);
		
		System.out.println(num1/num2);
		
		num1++;
		System.out.println(num1);
		
		num2--;
		System.out.println(num2);

		boolean bool = !true;
		System.out.println(bool);
		
		if(num1==num2) 
		
			System.out.println("Match");
		else
			System.out.println("Not a Match");
		
		if((num1==51) && (num2==29)) 
			
			System.out.println("Yes");
		else
			System.out.println("No");
		
	}

}
