package codejam;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class LastWord {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws FileNotFoundException
	{
		System.out.println("Enter no. of test cases.");
		FileInputStream fis = new FileInputStream("pancake.txt");
		Scanner in = new Scanner(fis);
		//Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i=1;i<=t;i++)
		{
			String word = in.next();
			StringBuilder sb = new StringBuilder();
			sb.append(word.charAt(0));
			if (word.length()>1)
			{
				for (int j=1;j<word.length();j++)
				{
					if (word.charAt(j)>=sb.charAt(0))
					{
						StringBuilder temp = new StringBuilder();
						temp.append(word.charAt(j));
						temp.append(sb);
						sb=temp;
					}
					else
					{
						sb.append(word.charAt(j));
					}
				}
			}
			
			System.out.println("Case #"+i+": "+sb);
		}
	}

}
