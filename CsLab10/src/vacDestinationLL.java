public class vacDestinationLL {

	/**************** ATTRIBUTES *******************************************
	/* Here go your attributes, i.e., the information that is contained in 
	 * your new "type" 
	 * We can also see these new types as "blue-prints" of "things" we are 
	 * going to build 
	 * Expected attributes are:
	 * •	A vacation destination (vacationDestination); and
	 * •	The address to the next node (vacDestinationLL).
	 ***********************************************************************/
	// linked lists are composed of nodes: each node contains two pieces of information
	// 1. the data of interest, 2. the address of the next node
	private vacationDestination myVacation;
	private vacDestinationLL Next;
	
	/**************** CONSTRUCTORS *****************************************
	 * note that the signatures are different from those we are used to 
	 ***********************************************************************/

	public vacDestinationLL() {
		myVacation = null;
		Next = null;
	}
	
	public vacDestinationLL(vacationDestination vac) {
        // your code goes here
    }	
	
	public vacDestinationLL(vacationDestination vac, vacDestinationLL L) {
        // your code goes here
    }	
	
	/***************** SETTERS / MUTATORS **********************************
	 * Methods that allow to set or modify the values of the attributes
	 * One method per attribute
	 * Note that the methods are not static (to be explained -- much -- later)
	 ***********************************************************************/
	public void setMyVacation(vacationDestination vac) {
		myVacation = vac;
	}
	
    // etc.	
    
	/**************** GETTERS / ACCESSORS **********************************
	 * Methods that allow to access the values of the attributes
	 * One method per attribute
	 * Note that the methods are not static (to be explained -- much -- later)
	 ***********************************************************************/
	public vacationDestination getMyVacation() {
		return myVacation;
	}
	
    // etc.	
    
	/***********************************************************************
	 * Other methods, as specified in lab instructions 
	 ***********************************************************************/
	public void printLL() {
        // your code goes here	
        // it has to print each vacationDestination in the list: use the print method from vacationDestination.java
	}

	public int sizeLL() {
        // your code goes here	
    }

	public int sizeLLR() {
        // recursive size method
    }
	
    // bonus
	public void removeHead() {
        // removes the first node of the list
    }
	
	public void addTail(vacationDestination VD) {
        // adds VD in a new node of the list and inserts it at the end of the list
    }
	
    // Bonus
	public void addNth(vacationDestination VD, int n) {
        // adds VD in a new node of the list and inserts it at between nodes n and n+1 of the current list
	}

}
