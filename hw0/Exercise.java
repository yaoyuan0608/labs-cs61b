public class Exercise {
	public static void drawTriangle(int k) {
		for (int i = 1; i <= k; i += 1) {
			for (int j = 1; j <= i; j += 1){
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	public static int max(int[] m) {
		int biggest = m[0];
		for (int i = 1; i < m.length; i += 1) {
			if (m[i] > biggest) {
				biggest = m[i];
			}
		}
		return biggest;
	}

	public static void windowPosSum(int[] a, int n) {
		for (int i = 0; i < a.length; i += 1) {
			if (a[i] < 0) {
				continue;
			}
			for (int j = i+1; j <= i+n; j += 1) {
				if (j >= a.length) {
					break;
				}
				a[i] = a[i] + a[j];
			}
		}
	}

	public static void main(String[] args) {
		drawTriangle(5);
		drawTriangle(10);

		int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
		System.out.println(max(numbers));

		int[] a = {1, 2, -3, 4, 5, 4};
		int n = 3;
		windowPosSum(a, n);
		System.out.println(java.util.Arrays.toString(a));

		int[] b = {1, -1, -1, 10, 5, -1};
		int m = 2;
		windowPosSum(b, m);
		System.out.println(java.util.Arrays.toString(b));	

		// Enhanced for loop;
		String[] c = {"cat", "dog", "laser horse", "ketchup", "horse", "horbse"};
		for (String s : c) {
			System.out.println(s);
		} 	
	}
}