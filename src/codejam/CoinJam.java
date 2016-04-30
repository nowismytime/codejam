package codejam;

import java.util.*;
import java.io.*;

public class CoinJam {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws FileNotFoundException
	{
		System.out.println("Enter no. of test cases.");
		//FileInputStream fis = new FileInputStream("pancake.txt");
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i=1;i<=t;i++)
		{
			int n=in.nextInt();
			int j=in.nextInt();
			int p1 = n-1;
			long start = (long) Math.pow(2, p1)+1;
			System.out.println(start);
			ArrayList<ArrayList<Long>> ans = new ArrayList<ArrayList<Long>>();
			while(ans.size()<j)
			{
				int base;
				String b1 = getBinary(start);
				//base 2
				base=2;
				long numb2 = 0;
				for (int ax=0;ax<b1.length();ax++)
				{
					if (b1.charAt(ax)=='1')
						numb2 += ((long)Math.pow(base, b1.length()-1-ax));
				}
				base=3;
				long numb3 = 0;
				for (int ax=0;ax<b1.length();ax++)
				{
					if (b1.charAt(ax)=='1')
						numb3 += ((long)Math.pow(base, b1.length()-1-ax));
				}
				base=4;
				long numb4 = 0;
				for (int ax=0;ax<b1.length();ax++)
				{
					if (b1.charAt(ax)=='1')
						numb4 += ((long)Math.pow(base, b1.length()-1-ax));
				}
				base=5;
				long numb5 = 0;
				for (int ax=0;ax<b1.length();ax++)
				{
					if (b1.charAt(ax)=='1')
						numb5 += ((long)Math.pow(base, b1.length()-1-ax));
				}
				base=6;
				long numb6 = 0;
				for (int ax=0;ax<b1.length();ax++)
				{
					if (b1.charAt(ax)=='1')
						numb6 += ((long)Math.pow(base, b1.length()-1-ax));
				}
				base=7;
				long numb7 = 0;
				for (int ax=0;ax<b1.length();ax++)
				{
					if (b1.charAt(ax)=='1')
						numb7 += ((long)Math.pow(base, b1.length()-1-ax));
				}
				base=8;
				long numb8 = 0;
				for (int ax=0;ax<b1.length();ax++)
				{
					if (b1.charAt(ax)=='1')
						numb8 += ((long)Math.pow(base, b1.length()-1-ax));
				}
				base=9;
				long numb9 = 0;
				for (int ax=0;ax<b1.length();ax++)
				{
					if (b1.charAt(ax)=='1')
						numb9 += ((long)Math.pow(base, b1.length()-1-ax));
				}
				base=10;
				long numb10 = 0;
				for (int ax=0;ax<b1.length();ax++)
				{
					if (b1.charAt(ax)=='1')
						numb10 += ((long)Math.pow(base, b1.length()-1-ax));
				}
				if(isPrime(numb2)==0&&isPrime(numb3)==0&&isPrime(numb4)==0&&isPrime(numb5)==0&&isPrime(numb6)==0&&isPrime(numb7)==0&&isPrime(numb8)==0&&isPrime(numb9)==0&&isPrime(numb10)==0)
				{
					ArrayList<Long> g1 = new ArrayList<Long>();
					g1.add(Long.parseLong(b1));
					g1.add(getFactor(numb2));
					g1.add(getFactor(numb3));
					g1.add(getFactor(numb4));
					g1.add(getFactor(numb5));
					g1.add(getFactor(numb6));
					g1.add(getFactor(numb7));
					g1.add(getFactor(numb8));
					g1.add(getFactor(numb9));
					g1.add(getFactor(numb10));
					ans.add(g1);
				}
				start +=2;
			}
			System.out.println("Case #"+i+":");
			for(int x2=0;x2<ans.size();x2++)
			{
				StringBuilder sb = new StringBuilder();
				for(int x1=0;x1<ans.get(x2).size();x1++)
				{
					sb.append(ans.get(x2).get(x1));
					sb.append(" ");
				}
				System.out.println(sb);
			}
		}
	}
	public static int isPrime(long numb2) {
	    int B = (int) Math.sqrt(numb2);
	    int C=1;
	    if (numb2==1)
	    {
	        C=0;
	    }
	    for (int i=2;i<=B;i++)
	    {
	        if (numb2%i==0)
	        {
	            C=0;
	            break;
	        }
	    }
	    return C;
	}
	public static String getBinary(long start) {
	    ArrayList<Integer> B = new ArrayList<Integer>();
	    if (start==0)
	    return "0";
	    else
	    {
	    while(start>0)
	    {
	        B.add((int) (start%2));
	        start = start/2;
	    }
	    Collections.reverse(B);
	    String listString = "";
        for (Integer s : B)
        {
            listString += s;
        }
        return listString;
	    }
	}
	public static long getFactor(long numb2) {
	    ArrayList<Integer> result = new ArrayList<Integer>();
	    int B = (int) Math.sqrt(numb2);
	    for (int i=2;i<=B;i++)
	    {
	        if (numb2%i==0)
	        {
	            result.add(i);
	        }
	    }
	    return result.get(0);
	}

}
