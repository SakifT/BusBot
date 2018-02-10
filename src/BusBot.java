import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class BusBot {

	String StationName;
	String BusLines;
	int StationID;
	static String name;
	
	BusBot()
	{
		StationName="MountainLair";
		BusLines="Red Line 7, "+"Purple Line 9, "+"Gold Line 6, "+"Route 2 Downtown ";
	}
	BusBot(String n)
	{
		StationName=n;			
	}
	public int DisplayMenu() throws IOException {
		System.out.println(name+", pick a station.");
		System.out.println("Where would you like to go? Pick a number from below.\n");
		System.out.println("1.MountainLair");
		System.out.println("2.Brooke Tower");
		System.out.println("3.Mountaineer Station");
		System.out.println("4.Coliseum");
		System.out.println("5.University Park Apartments");
		System.out.println("6.Downtown Depot");
		System.out.println("7.Morgantown Mall Theater");
		System.out.println("8.Public Safety Building");
		System.out.println("9.Star City\n");
		
	
		int StationStopNumber=0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Station Stop Number:");
		try{
		    StationStopNumber = Integer.parseInt(br.readLine());
		}catch(NumberFormatException nfe){
		    System.err.println("Invalid Format!");
		        }
			return StationStopNumber;
	}
	public void DisplayStation() {
		if(StationID==1) {
			StationName="MountainLair";
			BusLines="Please go on the Red Line 7, "+"Purple Line 9, "+"Gold Line 6, "+"Route 2 Downtown ";
		}
		else if(StationID==2) {
			StationName="Brooke Tower";
			BusLines="Please go on the Red Line 7, "+"Purple Line 9, "+"Gold Line 6, "+"Route 2 Downtown ";
		}
		else if(StationID==3) {
			StationName="Mountaineer Station";
			BusLines="Please go on the Red Line 7, "+"Gold Line 6 ";
		}
		else if(StationID==4) {
			StationName="Coliseum";
			BusLines="Please go on the Purple Line 9";
		}
		else if(StationID==5) {
			StationName="University Park Apartments";
			BusLines="Please go on the Purple Line 9";
		}
		else if(StationID==6) {
			StationName="Downtown Depot";
			BusLines="Please go on the Gold Line 6";
		}
		else if(StationID==7) {
			StationName="Morgantown Mall Theater";
			BusLines="Please go on Route 2 Downtown";
		}
		else if(StationID==8) {
			StationName="Public Safety Building";
			BusLines="Please go on Route 2 Downtown";
		}
		else if(StationID==9) {
			StationName="Star City";
			BusLines="Please go on the Red Line 7";
		}
		else {
			StationName="Error: Invalid Entry.";
			BusLines="Station stop is invalid. Please enter a valid station.";
		
		}

		System.out.println(StationName);
		System.out.println(BusLines);

		

	}
	
	public void DisplayWelcome() throws IOException
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to the BusBot.\n");
		System.out.println("The BusBot will acquire data from the MountainLine Transit Authority.\n");
		System.out.println("After you specify your destination, the bot will tell you which line you should go on to get there.\n");
		System.out.println("Would you kindly give me your name?");
		name = input.nextLine();
	}

	public static void main(String [] args) throws IOException {
		
		
		BusBot b = new BusBot();
		b.DisplayWelcome();
		
		int StationStop = 1;
		while (StationStop != 0) {
			b.StationID = b.DisplayMenu();
			
			b.DisplayStation();
			System.out.println("Do you want to choose another station?");

			Scanner input = new Scanner(System.in);
			String choice=input.nextLine();
			
			if (choice.equalsIgnoreCase("no"))
				StationStop=0;	
			System.out.println();
			
			
		}
		System.out.println("Enjoy your trip! ");
	}
	
}
	

