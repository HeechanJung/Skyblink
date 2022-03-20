package practice;

import java.util.Scanner;

public class GapjjaCalculator {

	public static void main(String[] args) {
		//Scanner input;
		//input = new Scanner(System.in);
		String gan[] = {"갑","을","병","정","무","기","경","신","임","계"};
		String zi[] = {"자","축","인","묘","진","사","오","미","신","유","슬","헤"};
		String ganzi[] = new String[60];
		for (int i=0;i<60;i++)
		{
			ganzi[i]=gan[i%10]+zi[i%12];// TODO Auto-generated method stub
		}
		int year=2018;
		System.out.print("년도를 입력하세요:");
		//year=integer.parselnt(br.readLine());
		System.out.println(ganzi[((year-4)+60)%60]+"년");
		

	}

}
