import java.text.SimpleDateFormat;
import java.util.*;

public class Demo9 {
	
	
	public static void main(String[] args) throws Exception 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String d = sc.nextLine();
		int max=0,ind=0;
		
		System.out.println(d);
		
		String s[] = d.split("\\s");
		
		for(int i=0; i<s.length; i++)
		{
			if(max < s[i].length())
			{
				max = s[i].length();
				ind = i;
			}
		}
			System.out.println(max +"\t"+s[ind]);
	}
		
}
