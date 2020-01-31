
public class ex1{
	public static  void main(String [] args)
	{
		Bicycle roadbike = new Bicycle();
		roadbike.size = "L";
		roadbike.parts = new RoadBikeParts();
		roadbike.parts.setTapeColor("red");// = "red";
		roadbike.spares();
	}
}

class Bicycle{
	String size;
	Parts parts;

	Bicycle(){
		parts=null;
	}
	void spares()
	{
		parts.spares();
	}
}

class Parts{
	String chain;
	String tire_size;

	void spares()
	{
		
		System.out.println("tire_size is "+ tire_size + " chain is " + chain );
	}
	String default_tire_size()
	{
		System.out.println("Error");
		return null;
	}

	void local_spares()
	{
		System.out.println("Nothing in spare func");
	}

	String default_chain()
	{
		return "10-speed";
	}

	void setTapeColor(String s){}


}




class RoadBikeParts extends Parts{
	String tape_color ;



	
	void spares()
	{
		System.out.println("tape_color "+ tape_color);
	}

	String default_tire_size()
	{
		return "23";
	}
	void setTapeColor(String s){this.tape_color=s;}

}


class MountainBikeParts extends Parts{

	String front_shock;
	String rear_shock;

	void spares()
	{
	System.out.println("rear_shock  "+rear_shock);
	}

	String default_tire_size()
	{
		return "2.1";
	}
}









