package codejam;
import java.util.*;
import java.io.*;
public class Fractile {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws FileNotFoundException
	{
		System.out.println("Enter no. of test cases.");
		FileInputStream fis = new FileInputStream("pancake.txt");
		Scanner in = new Scanner(fis);
		int t = in.nextInt();
		for (int i=1;i<=t;i++)
		{
			int k=in.nextInt();
			int c=in.nextInt();
			int s=in.nextInt();
			StringBuilder sb=new StringBuilder();
			for(int j=0;j<k;j++)
				sb.append(j*k+1);
			System.out.println("Case #"+i+": "+sb);
		}
	}

}
