package javaprograms;

public class StringLiteralVsObject {

	public static void main(String[] args) {
		String str1= "Java";
		String str3= "Java";
		String str2= new String("Java");		
					
		System.out.println(str1==str2); // Comapre with location of variable 
		System.out.println(str1.equals(str2)); //Comares with the value inside
		System.out.println(str1==str3);
		
		
		// TODO Auto-generated method stub

	}

}
