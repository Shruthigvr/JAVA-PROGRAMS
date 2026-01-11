package javaprograms;

public class StaticMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(addNew(10, 25)); // Arguments
		mixedParams("Well done", 4, (float) 2.9);

	}

	public static int addNew(int x, int y) { // Parameters

		int z = x + y;
		return z;

	}

	public static void mixedParams(String s, int i, float f) { // Parameters

		System.out.println(s);
		System.out.println(i);
		System.out.println(f);

	}

}
