import java.io.File;
import java.util.Scanner;

public class TestingRental {
private static Vehicle[] vehicle = new VehicleType[3];
static double[] carRentalRates = { 24.95, 29.95, 34.95 };
static double[] SUVRentalRates = { 149.95, 189.95, 224.95 };
static double[] truckRentalRates = { 514.95, 679.95, 797.95 };

public static void main(String[] args) {
	Scanner scan;
  vehicle[0] = new VehicleType("Ford Fusion", "34", 4, "AB4FG56789GM");
vehicle[1] = new VehicleType("Dodge Caravan", "25", 2, "QK3FL4278ME");
vehicle[2] = new VehicleType("Ten-Foot Truck", "12", 1, "EJ5KU2435BC");

  int choice = 0;
  do {
	  login();
   choice = displayMenu();
   if (choice == 1)
  displayRates(carRentalRates, SUVRentalRates, truckRentalRates);
   else if (choice == 2)
    displayAvaVehicles(vehicle);
   else if (choice == 3)
    displayRental();
   else if (choice == 7)
	 System.out.println("Goodbye");  
   System.exit(0);
  } while (choice > 0 && choice < 8);

}

private static void displayRental() {
  
  Scanner input = new Scanner(System.in);
  System.out.println("Enter vehicle(car,suv,truck)");
  String type = input.next();
  System.out.printf("%-10s%-10s%-10s\n", "DAILY", "WEEKLY", "MONTHLY");
  if (type.equalsIgnoreCase("car"))
   System.out.printf("%-10.2f%-10.2f%-10.2f", carRentalRates[0],
     carRentalRates[1], carRentalRates[2]);
  else if (type.equalsIgnoreCase("suv"))
   System.out.printf("%-10.2f%-10.2f%-10.2f", SUVRentalRates[0],
     SUVRentalRates[1], SUVRentalRates[2]);
  else if (type.equalsIgnoreCase("truck"))
   System.out.printf("%-10.2f%-10.2f%-10.2f", truckRentalRates[0],
     truckRentalRates[1], truckRentalRates[2]);

}

private static void displayAvaVehicles(Vehicle[] vehicle) {

  for (int i = 0; i < vehicle.length; i++) {

   System.out.println(vehicle[i]);
  }

}

private static void displayRates(double[] carRentalRates,
   double[] sUVRentalRates, double[] truckRentalRates) {

  String[] types = { "Car", "SUV", "truck" };

  for (int i = 0; i < truckRentalRates.length; i++) {
   System.out.printf("%-10s", types[i]);
   System.out.printf("%-10.2f%-10.2f%-10.2f", carRentalRates[i],
     sUVRentalRates[i], truckRentalRates[i]);
   System.out.println();
  }
}

private static int displayMenu() {
  System.out.println();
  Scanner menu = new Scanner(System.in);
  System.out.println("_______MAIN MENU_______");
  System.out.println("1 - Display rental rates");
  System.out.println("2 - Display available vehicles");
  System.out.println("3 - Display specific rental cost");
  System.out.println("4 - Make a reservation");
  System.out.println("5 - Cancel a reservation");
  System.out.println("6 - Display reservations");
  System.out.println("7 - Quit");
  System.out.println("Enter your choice: ");
  int choice = menu.nextInt();
  return choice;
}


public static void login(){
Scanner scan = null;
try{
	scan = new Scanner(new File("project.txt"));
	
}catch(Exception e){
	System.out.println("Cannot Open File");
}
Scanner keyboard = new Scanner (System.in);
String user = scan.nextLine();
String pass = scan.nextLine();
System.out.println("Please enter Username");
String inpUser = keyboard.nextLine();
System.out.println("Please enter Password");
String inpPass = keyboard.nextLine();
if(inpUser.equals(user) && inpPass.equals(pass)){
	System.out.print("You have successfully logged in");
}else{
	System.out.print("Username and Password not found in system");
}
}
}

