import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class manageVacations {

	/******************** ARRAYS OF OBJECTS **************************************/
	
	/*****************************************************************************
	 * A method, readVacation, that takes a file name as a string – this file 
	 * contains vacation information, and returns an array of items of type 
	 * vacationDestination. This method should handle file reading errors via 
	 * exception handling.
	 *****************************************************************************/
	public static vacationDestination[] ReadFromFile(String filename) throws IOException {
		
		FileReader fr = new FileReader(filename);
		BufferedReader textReader = new BufferedReader(fr);

        // your code goes here
    }

	
	/*****************************************************************************
	 * A method, sortDate, that takes an array of items of type vacationDestination, 
	 * and sorts them by date, from oldest to newest. 
	 *****************************************************************************/
	public static void SortByDate(vacationDestination[] vacations) {

        // your code goes here
    }
	
	/*****************************************************************************
	 * A method, earliest, that takes an array of items of type vacationDestination, 
	 * and returns the date your oldest vacation destinations.
	 *****************************************************************************/
	public static int earliest(vacationDestination[] vacations) {

        // your code goes here
    }
	
	/*****************************************************************************
	 * A method, enjoyed, that takes an array of items of type vacationDestination, 
	 * and returns the number of vacation destinations that were enjoyed.
	 *****************************************************************************/
	public static int Enjoyed(vacationDestination[] vacations) {

        // your code goes here
	}
	
	/*****************************************************************************
	 * A recursive method, enjoyed, that takes an array of items of type 
	 * vacationDestination, and returns the number of vacation destinations that 
	 * were enjoyed.
	 *****************************************************************************/
	public static int recEnjoyed(vacationDestination[] vacation, int n) {

        // your code goes here
	}
	
	/*****************************************************************************
	 * A method, betterClose, that takes:
	 * 	o	an array of items of type vacationDestination; as well as 
	 * 	o	an integer named dist that represents a distance in miles, 
	 * and returns:
	 * 	o	true if there are more (>=) vacation destinations in the array that are 
	 * closer than (<=) dist from home that were enjoyed, than vacation destinations 
	 * in the array that are farther than (>) dist from home and that were enjoyed; and 
	 * 	o	false if there are less (<) vacation destinations in the array that are 
	 * closer than (<=) dist from home that were enjoyed, than vacation destinations 
	 * in the array that are farther than (>) dist from home and that were enjoyed.
	 ******************************************************************************/ 
	public static boolean betterClose(vacationDestination[] vacations, int dist) {

        // your code goes here
	}
	
	
	/*************** LINKED LISTS OF OBJECTS **************************************/
	
	/******************************************************************************
	 * A method buildLL that takes an array of items of type vacationDestination
	 * and returns a linked list of type vacDestinationLL
	 ******************************************************************************/
	public static vacDestinationLL buildLL(vacationDestination[] vacations) {

        // your code goes here
	}
	
	/******************************************************************************
	 * A method chronoLLinsert that takes:
     *      a.	an array of vacationDestination vacations; and 
     *      b.	a vacationDestination extraVacation, 
     * and returns a linked-list of all of the items in vacations in chronological 
     * order (from oldest to newest) as well as extraVacation inserted at the right chronological 
     * position to ensure that the resulting list is sorting in ascending chronological order.
     * Hint: you will need to use the method sortDate and the method addTail.
	 ******************************************************************************/
    public static vacDestinationLL chronoLLinsert(vacationDestination[] vacations, vacationDestination extraVacation) {
        
        // your code goes here
    }
	
	/******************************************************************************
	 * Main method
	 ******************************************************************************/
	public static void main(String[] args) throws IOException {
		
        // test ReadFromFile
        System.out.println("Creating the array of vacation destinations:");
		vacationDestination[] myVacations = ReadFromFile("./vacations.txt"); 
		for (int i=0; i< myVacations.length; i++) {
			myVacations[i].print();
		}
        
        // test SortByDate
		System.out.println("Sorting the vacation destinations by date:");
		SortByDate(myVacations); 
		for (int i=0; i< myVacations.length; i++) {
			myVacations[i].print();
		}
		
        // test earliest
		int minDate = earliest(myVacations);
		
        // test betterClose
        if (betterClose(myVacations,700)) 
			System.out.println("You are better closer to home!");
		else
			System.out.println("You are better farther from home!");
		
        // test buildLL
		vacDestinationLL myList = buildLL(myVacations);

        // test sizeLL and sizeLLR
		System.out.println("Size of list: " + myList.sizeLL());

        // test removeHead
        myList.removeHead();
		myList.printLL();
	
        // print the rest of the methods here
	}
}
