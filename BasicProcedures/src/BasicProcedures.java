import java.util.Random;

public class BasicProcedures {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar=new int[10];
		Random random=new Random();
		for (int i=0;i<10;i++) {
			ar[i]=random.nextInt();
			System.out.print(ar[i]+" ");
		}
		System.out.println();
		
		int sum=getSum(ar);
		System.out.println("sum is "+sum);
		int max=getMax(ar);
		System.out.println("max is "+max);
		int min=getMin(ar);
		System.out.println("min is "+min);
		sort(ar);
		System.out.println(ar);
		
	}

	private static void sort(int[] ar) {
		// TODO Auto-generated method stub
		
	}

	private static int getMin(int[] ar) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static int getMax(int[] ar) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static int getSum(int[] ar) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
