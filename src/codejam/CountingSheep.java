package codejam;

import java.io.*;
import java.util.*;

public class CountingSheep {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws FileNotFoundException
	{
		System.out.println("Enter no. of test cases.");
		FileInputStream fis = new FileInputStream("cous.in");
		Scanner in = new Scanner(fis);
		int t = in.nextInt();
		for (int i=1;i<=t;i++)
		{
			//System.out.println("Enter order of pancakes");
			long n = in.nextLong();
			if (n==0)
			{
				System.out.println("Case #"+i+": INSOMNIA");
				continue;
			}
			String n1 = Long.toString(n);
			String n2 = Long.toString(2*n);
			String n3 = Long.toString(3*n);
			String n5 = Long.toString(5*n);
			String n7 = Long.toString(7*n);
			//String order = in.next();
			boolean flag = true;
			ArrayList<Character> ai = new ArrayList<Character>();
			for (int a=0;a<n1.length();a++)
			{
				if (!ai.contains(n1.charAt(a)))
					ai.add(n1.charAt(a));
			}
			for (int a=0;a<n2.length();a++)
			{
				if(!ai.contains(n2.charAt(a)))
				{
					flag=false;
					break;
				}
			}
			for (int a=0;a<n3.length();a++)
			{
				if(!ai.contains(n3.charAt(a)))
				{
					flag=false;
					break;
				}
			}
			for (int a=0;a<n5.length();a++)
			{
				if(!ai.contains(n5.charAt(a)))
				{
					flag=false;
					break;
				}
			}
			for (int a=0;a<n7.length();a++)
			{
				if(!ai.contains(n7.charAt(a)))
				{
					flag=false;
					break;
				}
			}
			int x=2;
			while(ai.size()<10)
			{
				long temp = n*x;
				String p1 = Long.toString(temp);
				for (int a=0;a<p1.length();a++)
				{
					if (!ai.contains(p1.charAt(a)))
					{
						ai.add(p1.charAt(a));
						//System.out.println(ai.size());
					}
				}
				x++;				
			}
			long ans = n*(x-1);
			if(flag)
				System.out.println("Case #"+i+": INSOMNIA");
			else
				System.out.println("Case #"+i+": "+ans);
	    }
	}

}
