package javaprograms;

public class ArrayDemo {

	public static void main(String[] args) {
		// Single Dimensional Array

		int[] newArray1 = new int[10];
		newArray1[0] = 50;

		int[] newArray2 = { 60, 80, 43, 15, 44 };

		System.out.println(newArray1[0]);

		System.out.println(newArray2[3]);

		System.out.println("Length of Array2 : " + newArray1.length);

		for (int i = 1; i < newArray2.length; i++) {
			System.out.println(newArray2[i]);
		}

		// Multi-dimensional Array

		int[][] multiArray1 = new int[3][2];
		multiArray1[0][0] = 56;

		int[][] multiArray2 = { { 1, 2 }, { 3, 4 }, { 5, 6 } };

		System.out.println("Multi Dim-Array1 : " + multiArray1[0][0]);

		System.out.println("Multi Dim-Array2 : " + multiArray2[2][1]);

		for (int i = 1; i < multiArray2.length; i++) {
			for (int j = 1; j < multiArray2[i].length; j++) {
				System.out.println(multiArray2[i][j]);
			}

		}

	}
}
