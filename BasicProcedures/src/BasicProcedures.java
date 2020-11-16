import java.util.Arrays;
import java.util.Random;

public class BasicProcedures {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = new int[10];
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			ar[i] = random.nextInt(10);
			System.out.print(ar[i] + " ");
		}
		System.out.println();

		int sum = getSum(ar);
		System.out.println("sum is " + sum);
		int max = getMax(ar);
		System.out.println("max is " + max);
		int min = getMin(ar);
		System.out.println("min is " + min);
		sort(ar);
		for(int i=0;i<ar.length;i++)
			System.out.print(ar[i]+ " ");
		

	}

	private static void sort(int[] ar) {
		Arrays.sort(ar);
	}

	private static int getMin(int[] ar) {

		int temp = Integer.MAX_VALUE;

		for(int i:ar) {
			if (temp > i) {
				temp = i;

			}

		}

		return temp;

	}

	private static int getMax(int[] ar) {
		int temp = Integer.MIN_VALUE;

		for (int i:ar) {
			if (temp < i) {
				temp = i;
			}

		}
		return temp;
	}

	private static int getSum(int[] ar) {
		int total = 0;
		for(int i:ar) {
			 total = total + i;
		}
		return total;
	}

}
