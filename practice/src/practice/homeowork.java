package practice;

import java.util.Scanner;

public class homeowork extends GapjjaCalculator {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("�ð�:");
		int totalsec=input.nextInt();
		
	
		
	if (totalsec<3600*24*365) {
		System.out.println("1�� ���� ���׿�");
	}
	else {
		System.out.println("1�� ���� ũ�׿�!");
		
	}
		
		
			int day = totalsec/(60*60*24);
			
	
			int hour =(totalsec-day*60*60*24)/(60*60);
		
			int minute=(totalsec-day*60*60*24-hour*3600)/60;
		 
			int second =totalsec%60;
			System.out.println(day+"��"+hour+"��"+minute+"��"+second+"��");
		
		// TODO Auto-generated method stub

	}

}
