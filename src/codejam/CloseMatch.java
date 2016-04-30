package codejam;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class CloseMatch {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws FileNotFoundException
	{
		System.out.println("Enter no. of test cases.");
		FileInputStream fis = new FileInputStream("B3.txt");
		Scanner in = new Scanner(fis);
		//Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i=1;i<=t;i++)
		{
			String C = in.next();
			String J = in.next();
			
			StringBuilder C1 = new StringBuilder(C);
			StringBuilder J1 = new StringBuilder(J);
			int j=0;
			while (j<C.length()&&(C.charAt(j)==J.charAt(j)||C.charAt(j)=='?'||J.charAt(j)=='?'))
			{
				
				if (C.charAt(j)=='?'&&J.charAt(j)!='?')
					C1.setCharAt(j, J.charAt(j));
				else if (C.charAt(j)!='?'&&J.charAt(j)=='?')
					J1.setCharAt(j, C.charAt(j));
				else if (C.charAt(j)=='?'&&J.charAt(j)=='?')
				{
					if (j+1==C.length())
					{
						C1.setCharAt(j, '0');
						J1.setCharAt(j, '0');
					}
					
					else if (C.charAt(j+1)!='?'&&J.charAt(j+1)!='?'&&(C.charAt(j+1)>J.charAt(j+1)&&C.charAt(j+1)-J.charAt(j+1)>5))
					{
						C1.setCharAt(j, '0');
						J1.setCharAt(j, '1');
					}
					else if (C.charAt(j+1)!='?'&&J.charAt(j+1)!='?'&&(C.charAt(j+1)<J.charAt(j+1)&&J.charAt(j+1)-C.charAt(j+1)>5))
					{
						J1.setCharAt(j, '0');
						C1.setCharAt(j, '1');
					}
					else
					{
						C1.setCharAt(j, '0');
						J1.setCharAt(j, '0');
					}					
					
				}
				j++;
			}
			if (j==C.length())
			{
				System.out.println("Case #"+i+": "+C1.toString()+" "+J1.toString());
				continue;
			}				
			if (J.charAt(j)>C.charAt(j))
			{
				j++;
				for(;j<C.length();j++)
				{
					if (C.charAt(j)=='?')
						C1.setCharAt(j, '9');
					if (J.charAt(j)=='?')
						J1.setCharAt(j, '0');				
				}
			}
			else
			{
				j++;
				for(;j<C.length();j++)
				{
					if (C.charAt(j)=='?')
						C1.setCharAt(j, '0');
					if (J.charAt(j)=='?')
						J1.setCharAt(j, '9');				
				}
			}
			
			System.out.println("Case #"+i+": "+C1.toString()+" "+J1.toString());
		}
	}

}
