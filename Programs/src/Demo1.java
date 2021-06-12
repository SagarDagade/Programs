import java.util.Scanner;

public class Demo1 {
	
	public int check(int sum)
	{
		if(sum % 2 == 0)
		{
			return -1;
		}
		else if(sum%2 != 0)
		{
			return 1;
		}
		return 0;
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int var = sc.nextInt();
		
		int s,sum=0;
		
		for(int i=0; var > 0 ; i++)
		{
			s = var % 10;
			//System.out.println(s);
			var = var / 10;
			
			if(s % 2 != 0)
			{
				sum = sum + s;
			}
			
		}
		System.out.println(sum);
		Demo d = new Demo();
		System.out.println(d.check(sum));
			
		
	}

}
