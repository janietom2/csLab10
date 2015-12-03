public class vacationDestination {

	/**************** ATTRIBUTES *******************************************
	/* Here go your attributes, i.e., the information that is contained in 
	 * your new "type" 
	 * We can also see these new types as "blue-prints" of "things" we are 
	 * going to build 
	 * Expected attributes are:
	 * •	The name of the city (String);
	 * •	The distance from home (int);
	 * •	The total amount of money spent during this vacation (double);
	 * •	The date at which you were on vacation at this destination 
	 * 		(int defined by YYYYMMDD; e.g., November 10, 2015 would be coded as 20151110); and
	 * •	Whether you enjoyed this vacation or not (Boolean).
	 ***********************************************************************/
	private String cityName;
	private boolean enjoyed;
	private int distance;
	private int date;
	private Double cost;

	// etc.
	
	/**************** CONSTRUCTORS *****************************************
	 * note that the signatures are different from those we are used to 
	 ***********************************************************************/
	/* default constructor: provided to you. You should not touch the next two lines of code */
	public vacationDestination() {
	}
	
	public vacationDestination(String city, int howfar, double amount, int when, boolean nice) {
        // etc.	
    }
	
	/***************** SETTERS / MUTATORS **********************************
	 * Methods that allow to set or modify the values of the attributes
	 * One method per attribute
	 * Note that the methods are not static (to be explained -- much -- later)
	 ***********************************************************************/
	public void setCityName(String city) {
		cityName = city;
	}

	public void setEnjoyed(boolean nice){
		enjoyed = nice;
	}

	public void setDistance(int howfar){
		distance = howfar;
	}

	public void setDate(int when){
		date = when;
	}

	public void setCost(Double amount){
		cost = amount;
	}


	// etc.
    
	/**************** GETTERS / ACCESSORS **********************************
	 * Methods that allow to access the values of the attributes
	 * One method per attribute
	 * Note that the methods are not static (to be explained -- much -- later)
	 ***********************************************************************/
	public String getCityName() {
		return cityName;
	}

	public boolean getEnjoyed(){
		return enjoyed;
	}

	public int getDistance(){
		return distance;
	}

	public int getDate(){
		return date;
	}

	public Double getCost(){
		return cost;
	}
		
	// etc.

	public String wasItGood(boolean answer){
		if (answer == true){
			return "This vacation was great!";
		}else{
			return "This vacation was not so great…";
		}
	}

	/***********************************************************************
	 * Other methods, depending on needs 
	 * Here we are asking you to design a method that prints the information
	 * about any vacation destination
	 ***********************************************************************/
	public String print() {
		return "Destination: "+getCityName()+" on "+getDistance()+"\n"
				+"Distance from home: "+getDistance()+" miles"+"\n"
				+"Total expense: "+getCost()+"\n"
				+wasItGood(getEnjoyed());
	}

}
