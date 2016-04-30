package codejam;

import java.util.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FakeTopic {
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
			int N = in.nextInt();
			ArrayList<String> fw = new ArrayList<String>();
			HashMap<String, Integer> fw2 = new HashMap<String, Integer>();
			HashMap<String, Integer> sw2 = new HashMap<String, Integer>();
			ArrayList<String> sw = new ArrayList<String>();
			for (int j=0;j<N;j++)
			{
				String fw1 = in.next();
				String sw1 = in.next();
				fw.add(fw1);
				sw.add(sw1);
				if (fw2.containsKey(fw1))
					fw2.put(fw1, fw2.get(fw1)+1);
				else
					fw2.put(fw1,1);
				if (sw2.containsKey(sw1))
					sw2.put(sw1, sw2.get(sw1)+1);
				else
					sw2.put(sw1,1);
			}
			for (int x=0;x<fw.size();x++)
			{
				String fw1 = fw.get(x);
				String sw1 = sw.get(x);
				if (fw2.get(fw1)==1||sw2.get(sw1)==1)
				{
					fw2.put(fw1, fw2.get(fw1)-1);
					sw2.put(sw1, sw2.get(sw1)-1);
				}
			}
			int ans=0;
			for(String key:fw2.keySet())
			{
				if (fw2.get(key)>1)
					ans+=fw2.get(key)-1;
			}
			System.out.println("Case #"+i+": "+ans);
			
		}
	}
	

}
