import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Function;


public class Demo7 {
	
	
	public static void main(String[] args) throws Exception 
	{
		
		LocalDate dt1 = LocalDate.of(2012,12,1);
		LocalDate dt2 = LocalDate.of(2012,1,3);
		
		
		Period p = Period.between(dt1, dt2 );
		System.out.println(p.getYears()+"-"+p.getMonths()+"-"+p.getDays());
		
	}
		
}
