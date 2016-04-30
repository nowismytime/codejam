package codejam;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class RankFile {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws FileNotFoundException
	{
		System.out.println("Enter no. of test cases.");
		//FileInputStream fis = new FileInputStream("pancake.txt");
		//Scanner in = new Scanner(fis);
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i=1;i<=t;i++)
		{
			int N = in.nextInt();
			int min= 2600;
			ArrayList<ArrayList<Integer>> unsort = new ArrayList<ArrayList<Integer>>();
			for (int j=0;j<2*N-1;j++)
			{
				ArrayList<Integer> temp = new ArrayList<Integer>();
				for (int k=0;k<N;k++)
				{
					int ii = in.nextInt();
					temp.add(ii);
					if (ii<min)
						min=ii;
				}
				unsort.add(temp);
			}
			
			ArrayList<Integer> index = new ArrayList<Integer>();
			for (int j=0;j<unsort.size();j++)
			{
				if (unsort.get(j).get(0)==min)
					index.add(j);
			}
			ArrayList<ArrayList<Integer>> rows = new ArrayList<ArrayList<Integer>>();
			ArrayList<ArrayList<Integer>> cols = new ArrayList<ArrayList<Integer>>();
			if(index.size()==2)
			{
				System.out.println("first col and row found!");
				rows.add(unsort.get(index.get(0)));
				cols.add(unsort.get(index.get(1)));
				int j1=1;
				while(j1<N)
				{
					int str = cols.get(0).get(j1);
					for (int x1=0;x1<unsort.size();x1++)
					{
						if (unsort.get(x1).get(0)==str)
						{
							int flag=1;
							for (int x2=0;x2<N;x2++)
								if(unsort.get(x1).get(x2)<=rows.get(j1-1).get(x2))
								{
									flag=0;
									break;
								}
							if(flag==1)
							{
								System.out.println("row found");
								rows.add(unsort.get(x1));
								unsort.remove(x1);
								break;
							}
								
						}
					}
					j1++;
				}
				if (rows.size()<N)
				{
					System.out.println("taking transpose");
					rows = new ArrayList<ArrayList<Integer>>();
					cols = new ArrayList<ArrayList<Integer>>();
					rows.add(unsort.get(index.get(1)));
					cols.add(unsort.get(index.get(0)));
					j1=1;
					while(j1<N)
					{
						int str = cols.get(0).get(j1);
						for (int x1=0;x1<unsort.size();x1++)
						{
							if (unsort.get(x1).get(0)==str)
							{
								int flag=1;
								for (int x2=0;x2<N;x2++)
									if(unsort.get(x1).get(x2)<=rows.get(j1-1).get(x2))
									{
										flag=0;
										break;
									}
								if(flag==1)
								{
									System.out.println("row found");
									rows.add(unsort.get(x1));
									unsort.remove(x1);
									break;
								}	
							}
						}
						j1++;
					}
				}
				System.out.println(rows);
				for (int k1=0;k1<N;k1++)
				{
					ArrayList<Integer> t123 = new ArrayList<Integer>();
					for (int k2=0;k2<N;k2++)
						t123.add(rows.get(k1).get(k2));
					System.out.println(t123);
					if(!unsort.contains(t123))
					{
						System.out.println("match");
						System.out.println("Case #"+i+": "+t123);
						break;
					}
				}
			}
			else
				System.out.println("error");
		}
	}

}
