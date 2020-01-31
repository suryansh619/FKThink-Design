



//Since there is no concept of modules in java thus implementing it with inheritance just for example purpose only!!!
class Schedule{


	 boolean Scheduled_already (Bicycle cycle_x, int start_date, int end_date)
	 {
	 	
	 	System.out.println("This "+cycle_x+" is not scheduled between "+ start_date + " and " + end_date);
	 	return false;
	 } 
	 boolean Scheduled_already (Vehicle  vehicle_x, int start_date, int end_date)
	 {
	 	
	 	System.out.println("This "+vehicle_x+" is not scheduled between "+ start_date + " and " + end_date);
	 	return false;
	 }
	 boolean Scheduled_already (Mechanic mech_x, int start_date, int end_date)
	 {
	 	
	 	System.out.println("This "+mech_x+" is not scheduled between "+ start_date + " and " + end_date);
	 	return false;
	 }
}



class Bicycle extends Schedule{
	int lead_days()
	{
		return  1;
	}
}


class Vehicle extends Schedule{
	int lead_days()
		{
			return 3;
		}
}

class Mechanic extends Schedule{
	int lead_days()
	{
		return 4;
	}
}








public class ex2{
	public static  void main(String [] args)
	{
		int starting = 10;
		int ending = 21;
		Bicycle b = new Bicycle();
		b.Scheduled_already(b, starting, ending);
		Vehicle v = new Vehicle();
		v.Scheduled_already(v, starting, ending);
		Mechanic m = new Mechanic();
		m.Scheduled_already(m, starting,ending);
	}
}







