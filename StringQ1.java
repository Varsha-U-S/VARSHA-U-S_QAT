package AssignmentQ1;

import java.util.ArrayList;
import java.util.Scanner;

public class StringQ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the size of string array : ");
		System.out.println();
		ArrayList<String> arraylist = new ArrayList<String>();
		Scanner sc = new Scanner(System.in); 
		
		int n = sc.nextInt();
		System.out.print("Enter the " + n + " number of string array : ");
		System.out.println();
		
		for(int a=0;a<n;a++) 
		{
			arraylist.add(sc.next());
		}
		
		System.out.println("Strings after reversing : ");
		
		for(int b=arraylist.size()-1;b>=0;b--) 
		{
			System.out.println(arraylist.get(b));
		}

	}
	

}
