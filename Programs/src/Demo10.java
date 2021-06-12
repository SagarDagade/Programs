import java.text.SimpleDateFormat;
import java.util.*;

public class Demo10 {
	
	
	public static void main(String[] args) throws Exception 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String d = sc.nextLine();
		int max=0,ind=0;
		
		System.out.println(d);
		
		char s[] = d.toCharArray();
		
		for(int i=s.length-1; i >= 0; i--)
		{
			System.out.print(s[i]+"-");
		}
		
		
	}
		
}
