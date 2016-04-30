package codejam;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class BFF {
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
			int N = in.nextInt();
			ArrayList<Integer> bff = new ArrayList<Integer>();
			for (int j=0;j<N;j++)
				bff.add(in.nextInt());
			int max=0;
			for(int j=0;j<N;j++)
			{
				int start = j+1;
				int itr=0;
				ArrayList<Integer> prev = new ArrayList<Integer>();
				prev.add(start);
				int next= bff.get(j);
				while(next!=start&&itr<11)
				{
					int temp = bff.get(next-1);
					if (!prev.contains(temp))
					{
						
						prev.add(next);
						next=temp;
						itr++;
					}
					else
					{
						prev.add(next);
						for (int x=0;x<N;x++)
						{
							if(bff.get(x)==next&&!prev.contains(x+1))
							{
								prev.add(x+1);
								break;
							}							
						}
						break;
					}
				}
				if(prev.size()>max)
					max=prev.size();
			}
			System.out.println("Case #"+i+": "+max);
		}
	}

}
