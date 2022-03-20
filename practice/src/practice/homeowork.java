package practice;

import java.util.Scanner;

public class homeowork extends GapjjaCalculator {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("시간:");
		int totalsec=input.nextInt();
		
	
		
	if (totalsec<3600*24*365) {
		System.out.println("1년 보다 적네요");
	}
	else {
		System.out.println("1년 보다 크네요!");
		
	}
		
		
			int day = totalsec/(60*60*24);
			
	
			int hour =(totalsec-day*60*60*24)/(60*60);
		
			int minute=(totalsec-day*60*60*24-hour*3600)/60;
		 
			int second =totalsec%60;
			System.out.println(day+"일"+hour+"시"+minute+"분"+second+"초");
		
		// TODO Auto-generated method stub

	}

}
