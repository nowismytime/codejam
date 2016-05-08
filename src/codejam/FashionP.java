package codejam;

import java.util.*;
import java.io.*;

public class FashionP {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws FileNotFoundException
	{
		System.out.println("Enter no. of test cases.");
		FileInputStream fis = new FileInputStream("C1.txt");
		Scanner in = new Scanner(fis);
		//Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i=1;i<=t;i++)
		{
			int J = in.nextInt();
			int P = in.nextInt();
			int S = in.nextInt();
			int K = in.nextInt();
			ArrayList<ArrayList<Integer>> comb = new ArrayList<ArrayList<Integer>>();
			if (K>=S)
			{
				for (int x=1;x<=J;x++)
				{
					for (int y=1;y<=P;y++)
					{
						for (int z=1;z<=S;z++)
						{
							ArrayList<Integer> temp = new ArrayList<Integer>();
							temp.add(x);
							temp.add(y);
							temp.add(z);
							comb.add(temp);
						}
					}
				}
			}
			else
			{
				for (int x=1;x<=J;x++)
				{
					for (int y=1;y<=P;y++)
					{
						for (int z=1;z<=K;z++)
						{
							ArrayList<Integer> temp = new ArrayList<Integer>();
							temp.add(x);
							temp.add(y);
							temp.add(z);
							comb.add(temp);
						}
					}
				}
			}
			System.out.println("Case #"+i+": "+comb.size());
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

}
