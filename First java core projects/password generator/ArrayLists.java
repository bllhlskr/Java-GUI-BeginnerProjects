import java.util.ArrayList;
import java.util.Collections;


public class ArrayLists 
{
	public static void main(String[] args) 
	{
		/*
		 * primitive: int, double, boolean, char
		 * generic: Integer, Double, Boolean, Character
		 */
		ArrayList<Double> list = new ArrayList<Double>();
		//int[] list = new int[];
		System.out.println(list.size());
		
		list.add(234.0);
		list.add(4235.0);
		list.add(456.0);
		list.add(34.5);
		System.out.println(list.size());
		System.out.println(list.get(0)); //list[0]
		System.out.println(list.get(1)); //list[1]
		for(int i = 0; i < list.size(); i++)
		{
			System.out.print(list.get(i) + "\t");
		}
		System.out.println();
		
		list.add(1, 0.5);
		list.add(1, 0.5);
		System.out.println(list.size());
		System.out.println(list.get(1)); //list[1]
		System.out.println(list.get(2)); //list[1]
		for(int i = 0; i < list.size(); i++)
		{
			System.out.print(list.get(i) + "\t");
		}
		System.out.println();
		/*list.clear();
		System.out.println(list.size());
		*/
		System.out.println(list.contains(0.5));
		System.out.println(list.isEmpty());
		list.remove(0);
		list.add(0, 0.0);
		for(int i = 0; i < list.size(); i++)
		{
			System.out.print(list.get(i) + "\t");
		}
		System.out.println();
		list.remove(0.5);

		for(int i = 0; i < list.size(); i++)
		{
			System.out.print(list.get(i) + "\t");
		}
		System.out.println();
		Collections.sort(list);

		for(int i = 0; i < list.size(); i++)
		{
			System.out.print(list.get(i) + "\t");
		}
		System.out.println();
		
		System.out.println("--------------");
		
		//for every item on the list: 
		for(Double d: list) //foreach loop
		{
			System.out.print(d + "\t");
		}
		
		/*
		list.add(new Integer(123));
		list.add(45.6);
		list.add("java");
		list.add('d');
		list.add(true);
		*/
	}
}
