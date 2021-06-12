import java.text.SimpleDateFormat;
import java.util.*;

public class Demo6 {
	
	
	public static void main(String[] args) throws Exception 
	{
		Scanner sc = new Scanner(System.in);
		String d = sc.nextLine();
		
		Date dt = new SimpleDateFormat("dd/MM/yyyy").parse(d);
		SimpleDateFormat st = new SimpleDateFormat("MMMM");
		String dd = st.format(dt);
		System.out.println(dd);
	}
		
}
