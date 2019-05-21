package week03;

import java.util.Scanner;

public class makingDollars {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("How many days you will work :");
		int days=sc.nextInt(); 
		int amount = 1;
		int totalAmount=0;
		for(int i=1;i<=days;i++)
		{
			System.out.println("$$ earnings on day : "+i+" is $"+amount);
			totalAmount+=amount;
			amount=amount*2;
			
		}
		System.out.println("Total Earnings : "+totalAmount);

	}

}
