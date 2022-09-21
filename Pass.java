package day4;

import java.util.Scanner;

public class Pass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter pass");
		int y=sc.nextInt();
		
		
		int pass=123;
		
		int n=1;
		while(n<=3)
		{
			if(pass==y)
			{
			System.out.println("Acces");
			}
			else
			{
				System.out.println("card is block");
				
			}
				n++;
		}
		
		}

}
