package practice;

import java.util.Scanner;

public class GapjjaCalculator {

	public static void main(String[] args) {
		//Scanner input;
		//input = new Scanner(System.in);
		String gan[] = {"��","��","��","��","��","��","��","��","��","��"};
		String zi[] = {"��","��","��","��","��","��","��","��","��","��","��","��"};
		String ganzi[] = new String[60];
		for (int i=0;i<60;i++)
		{
			ganzi[i]=gan[i%10]+zi[i%12];// TODO Auto-generated method stub
		}
		int year=2018;
		System.out.print("�⵵�� �Է��ϼ���:");
		//year=integer.parselnt(br.readLine());
		System.out.println(ganzi[((year-4)+60)%60]+"��");
		

	}

}
