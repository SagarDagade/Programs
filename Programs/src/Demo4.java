import java.util.*;

public class Demo4 {
	
	
	public static void main(String[] args) throws Exception 
	{
		int temp=0;
		ArrayList list1 = new ArrayList();
		ArrayList list2 = new ArrayList();
		ArrayList list3 = new ArrayList();
		
		list1.add(12);
		list1.add(1);
		list1.add(32);
		list1.add(3);
		
		list2.add(0);
		list2.add(12);
		list2.add(2);
		list2.add(23);
		
		for(int i=0; i<4; i++)
		{
			list3.add(0);
		} 
		
		for(int i=0; i<list2.size(); i++)
		{	
			temp= (int) list2.get(i);
			if(temp % 2 == 0)
			{
				list3.set(i, list2.get(i));
			}
			System.out.print(list2.get(i) + "\t");
		}
		System.out.println();
		
		 for(int i=0; i<list1.size(); i++)
		{
			temp= (int) list1.get(i);
			if(temp % 2 != 0)
			{
				list3.set(i, list1.get(i));
			}
			System.out.print(list1.get(i) + "\t");
		}
		System.out.println();
		
		for(int i=0; i<list3.size(); i++)
		{
		System.out.print(list3.get(i) +"\t");
		} 
	}

}
