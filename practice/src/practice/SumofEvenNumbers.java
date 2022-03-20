package practice;

public class SumofEvenNumbers {

	public static void main(String[] args) {
		int x=1;
		int sum=0;
		
		while(2*x<=100)
		{
			sum=sum+2*x;
			x++;
		}
		System.out.println("1~100까지의 짝수의 합"+ sum);
		
		// TODO Auto-generated method stub

	}

}
