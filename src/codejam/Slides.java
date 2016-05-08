package codejam;

import java.util.*;
import java.io.*;
public class Slides {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws FileNotFoundException
	{
		System.out.println("Enter no. of test cases.");
		FileInputStream fis = new FileInputStream("B2.txt");
		Scanner in = new Scanner(fis);
		//Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i=1;i<=t;i++)
		{
			int B=in.nextInt();
			long M = in.nextLong();
			ArrayList<ArrayList<Integer>> path = new ArrayList<ArrayList<Integer>>();
			for (int j=0;j<B;j++)
			{
				ArrayList<Integer> temp = new ArrayList<Integer>();
				for (int k=0;k<B;k++)
				{
					temp.add(0);
				}
				path.add(temp);
			}
			long np = M;
			path.get(0).set(B-1, 1);
			np--;
			if (np==0)
			{
				print(path,i);
				continue;
			}
			for (int j=2;j<B&&np>0;j++)
			{
				path.get(0).set(j-1, 1);
				path.get(j-1).set(B-1, 1);
				np--;
			}
			if (np==0)
			{
				print(path,i);
				continue;
			}
			for (int k=3;k<B-2&&np>0;k++)
			{
				for (int j=k;j<B-1&&np>0;j++)
				{
					path.get(k-1).set(j-1,1);
					np -= k-2;
				}
			}
			if (np==0)
			{
				print(path,i);
				continue;
			}
			else
				System.out.println("Case #"+i+": IMPOSSIBLE");
		}
	}
	
	public static void print(ArrayList<ArrayList<Integer>> comb, int i)
	{
		System.out.println("Case #"+i+": POSSIBLE");
		for(int j=0;j<comb.size();j++)
		{
			StringBuilder sb = new StringBuilder();
			for (int k=0;k<comb.get(j).size();k++)
			{
				sb.append(comb.get(j).get(k));
				sb.append(" ");
			}
			System.out.println(sb.toString());
		}
	}

}
