package adapters;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;

public class Main
{

	public static void main(String[] args)
	{
		List<String> array = Arrays.asList("1", "2", "three");
		Enumeration<String> enumer = new IteratorEnumeration<>(array.iterator());
		for (String string; enumer.hasMoreElements();)
		{
			string = enumer.nextElement();
			System.out.println(string);
		}
	}

}
