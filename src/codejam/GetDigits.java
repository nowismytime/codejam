package codejam;

import java.util.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class GetDigits {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws FileNotFoundException
	{
		System.out.println("Enter no. of test cases.");
		FileInputStream fis = new FileInputStream("A2.txt");
		Scanner in = new Scanner(fis);
		//Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i=1;i<=t;i++)
		{
			String input = in.next();
			HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
			for (int j=0;j<input.length();j++)
			{
				if (!hm.containsKey(input.charAt(j)))
					hm.put(input.charAt(j), 1);
				else
					hm.put(input.charAt(j), hm.get(input.charAt(j))+1);						
			}
			ArrayList<Integer> digits = new ArrayList<Integer>();
			if (hm.containsKey('Z'))
			{
				int count = hm.get('Z');
				if (hm.get('E')==count)
					hm.remove('E');
				else
					hm.put('E', hm.get('E')-count);
				if (hm.get('R')==count)
					hm.remove('R');
				else
					hm.put('R', hm.get('R')-count);
				if (hm.get('O')==count)
					hm.remove('O');
				else
					hm.put('O', hm.get('O')-count);
				hm.remove('Z');
				while(count>0)
				{
					digits.add(0);
					count--;
				}
			}
			if (hm.containsKey('W'))
			{
				int count = hm.get('W');
				if (hm.get('T')==count)
					hm.remove('T');
				else
					hm.put('T', hm.get('T')-count);
				if (hm.get('O')==count)
					hm.remove('O');
				else
					hm.put('O', hm.get('O')-count);
				hm.remove('W');
				while(count>0)
				{
					digits.add(2);
					count--;
				}
			}
			if (hm.containsKey('U'))
			{
				int count = hm.get('U');
				if (hm.get('F')==count)
					hm.remove('F');
				else
					hm.put('F', hm.get('F')-count);
				if (hm.get('R')==count)
					hm.remove('R');
				else
					hm.put('R', hm.get('R')-count);
				if (hm.get('O')==count)
					hm.remove('O');
				else
					hm.put('O', hm.get('O')-count);
				hm.remove('U');
				while(count>0)
				{
					digits.add(4);
					count--;
				}
			}
			if (hm.containsKey('X'))
			{
				int count = hm.get('X');
				if (hm.get('S')==count)
					hm.remove('S');
				else
					hm.put('S', hm.get('S')-count);
				if (hm.get('I')==count)
					hm.remove('I');
				else
					hm.put('I', hm.get('I')-count);
				hm.remove('X');
				while(count>0)
				{
					digits.add(6);
					count--;
				}
			}
			if (hm.containsKey('G'))
			{
				int count = hm.get('G');
				if (hm.get('E')==count)
					hm.remove('E');
				else
					hm.put('E', hm.get('E')-count);
				if (hm.get('I')==count)
					hm.remove('I');
				else
					hm.put('I', hm.get('I')-count);
				if (hm.get('T')==count)
					hm.remove('T');
				else
					hm.put('T', hm.get('T')-count);
				if (hm.get('H')==count)
					hm.remove('H');
				else
					hm.put('H', hm.get('H')-count);
				hm.remove('G');
				while(count>0)
				{
					digits.add(8);
					count--;
				}
			}
			if (hm.containsKey('O'))
			{
				int count = hm.get('O');
				if (hm.get('N')==count)
					hm.remove('N');
				else
					hm.put('N', hm.get('N')-count);
				if (hm.get('E')==count)
					hm.remove('E');
				else
					hm.put('E', hm.get('E')-count);
				hm.remove('O');
				while(count>0)
				{
					digits.add(1);
					count--;
				}
			}
			if (hm.containsKey('H'))
			{
				int count = hm.get('H');
				if (hm.get('T')==count)
					hm.remove('T');
				else
					hm.put('T', hm.get('T')-count);
				if (hm.get('R')==count)
					hm.remove('R');
				else
					hm.put('R', hm.get('R')-count);
				if (hm.get('E')==2*count)
					hm.remove('E');
				else
					hm.put('E', hm.get('E')-2*count);
				hm.remove('H');
				while(count>0)
				{
					digits.add(3);
					count--;
				}
			}
			if (hm.containsKey('F'))
			{
				int count = hm.get('F');
				if (hm.get('I')==count)
					hm.remove('I');
				else
					hm.put('I', hm.get('I')-count);
				if (hm.get('V')==count)
					hm.remove('V');
				else
					hm.put('V', hm.get('V')-count);
				if (hm.get('E')==2*count)
					hm.remove('E');
				else
					hm.put('E', hm.get('E')-2*count);
				hm.remove('F');
				while(count>0)
				{
					digits.add(5);
					count--;
				}
			}
			if (hm.containsKey('S'))
			{
				int count = hm.get('S');
				while(count>0)
				{
					digits.add(7);
					count--;
				}
			}
			if (hm.containsKey('I'))
			{
				int count = hm.get('I');
				while(count>0)
				{
					digits.add(9);
					count--;
				}
			}
			Collections.sort(digits);
			StringBuilder C1 = new StringBuilder();
			for (int x=0;x<digits.size();x++)
				C1.append(digits.get(x));
			System.out.println("Case #"+i+": "+C1.toString());		
			
		}
	}

}
