package javaprograms;

import java.util.Scanner;

public class SwitchDemo {

	// Calculator demo
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, num1, num2;
		char op;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter value for first number : ");
		num1 = sc.nextInt();
		System.out.println("Enter value for second number : ");
		num2 = sc.nextInt();
		System.out.println("Enter the operator(+,-,*,/) : ");
		op = sc.next().charAt(0);

		switch (op) {
		case '+':
			num = num1 + num2;
			System.out.println("Result : " + num);
			break;
		case '-':
			num = num1 - num2;
			System.out.println("Result : " + num);
			break;
		case '*':
			num = num1 * num2;
			System.out.println("Result : " + num);
			break;
		case '/':
			num = num1 / num2;
			System.out.println("Result : " + num);
			break;
		 default:
             System.out.println("Invalid operator");
		}
	}

}
