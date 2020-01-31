

class Schedule{


	 boolean Scheduled_already (Bicycle cycle_x, int start_date, int end_date)
	 {
	 	
	 	System.out.println("This Bicycle  is not scheduled between "+ start_date + " and " + end_date);
	 	return false;
	 } 
}



class Bicycle{
	Schedule sche ;
	String size;
	String chain;
	String tire_size;
	
	Bicycle()
	{
		 sche = new Schedule();

	}



	boolean schedulable(int start_date, int end_date)
	{
		System.out.println("I am here1");
		return scheduled(start_date - lead_days() , end_date);
	}

	boolean scheduled(int start_date, int end_date)
	{

		System.out.println("I am here2");
		return sche.Scheduled_already(this , start_date, end_date);
	}

	int lead_days()
	{
		return 1;
	}
 
}
		

public class ex1{
	public static void main(String [] args)
	{
		System.out.println("helo");
		int starting  = 10;
		int ending = 21;

		Bicycle racebike = new Bicycle();
		racebike.size  = "44";
		racebike.chain = "9-gear wali";
		racebike.tire_size = "23";
		racebike.schedulable(starting,ending);
	}
}
