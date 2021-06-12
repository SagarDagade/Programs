import java.util.*;

public class Demo3 {
	
	
	public static void main(String[] args) throws Exception 
	{
		Scanner sc = new Scanner(System.in);
		int diff=0,p1=0,p2=0,sum=0;
		
		System.out.println("Enter no of elements u want 2 enter :");
		int sz = sc.nextInt();
		int arr[] = new int[sz];	
		
		for(int i=0; i<sz;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0; i<(sz-1);i++)
		{
			diff = arr[i] - arr[i+1];
			
			if(sum < diff)
			{
				sum = diff;
				p1=i;
				p2=i+1;
			}
			//System.out.print( arr[i+1] - arr[i] +"\t");
		}
		System.out.println();
		System.out.println("Max diffrence :"+sum);
		System.out.println("Between "+arr[p1] +" & "+ arr[p2]);
		
	}

}
