package codejam;

import java.util.*;
import java.io.*;
public class Pancakes {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws FileNotFoundException
	{
		System.out.println("Enter no. of test cases.");
		FileInputStream fis = new FileInputStream("pancake.txt");
		Scanner in = new Scanner(fis);
		int t = in.nextInt();
		for (int i=0;i<t;i++)
		{
			//System.out.println("Enter order of pancakes");
			String order = in.next();
			int count=0;
			for(int j=0;j<order.length();)
			{
				if (j==0&&order.charAt(j)=='-')
				{
					while(j<order.length()&&order.charAt(j)=='-')
						j++;
					count++;
				}
				else if (order.charAt(j)=='-')
				{
					while(j<order.length()&&order.charAt(j)=='-')
						j++;
					count++;
					count++;
				}
				else
					j++;
			}
			int temp = i+1;
			System.out.println("Case #"+temp+": "+count);
	    }
	}

}
