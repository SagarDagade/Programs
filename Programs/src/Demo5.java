import java.util.*;

public class Demo5 {
	
	
	public static void main(String[] args) throws Exception 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the No : ");
		
		int n = sc.nextInt();
		int fib=0,prv=1,sum=0;
		
		for(int i=0; i < n; i++ )
		{
			fib = fib + prv;
			sum = sum + fib;
			System.out.println(fib +"\t"+ sum);
			prv = i;
			
			
		}
	}
		
}
