package Demo1;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x="";
		System.out.println("Enter a string");
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		for(int i=a.length()-1; i>=0; i--)
		{			
			x=x+a.charAt(i);
		}
		System.out.println(x);
		if(a.toUpperCase().equals(x.toUpperCase()))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}

}
