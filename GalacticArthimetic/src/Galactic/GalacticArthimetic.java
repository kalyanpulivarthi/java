package Galactic;
import java.util.Scanner;
public class GalacticArthimetic {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter 2 numbers:");
		long num1=scan.nextLong();
		long num2=scan.nextLong();
		long res=galacticAddition(num1, num2);
		System.out.println(res);
				
		

	}
	public static long galacticAddition(long num1, long num2)
	{
		return num1+num2;
	}


}
