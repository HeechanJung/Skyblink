package practice;

import java.util.Scanner;

public class practice extends GapjjaCalculator {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("input :");
		int num=input.nextInt();
		
		
		for(int i=0;i<num;i++)
		{
			for(int j=i;j<num-1;j++)
			{
				System.out.print(" ");
			}
			for (int k=0;k<i*2+1;k++)
			
				System.out.print("*");
				System.out.println();
			
		}
		for (int i=0;i<num-1;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(" ");
			}
			for (int k=num-1;k>i*2-1;k--)
				System.out.print("*");
			System.out.println();
			
		}
			
			
		
		// TODO Auto-generated method stub

	}

}
