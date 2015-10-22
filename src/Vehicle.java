public abstract class Vehicle
{
//Declare variables
private String description;
private String mpg;
private int num;
private String VIN;

//Create a Reservation's class object
Reservation res = null;

//Constructor with parameters
public Vehicle(String description, String mpg, int num, String VIN)
{

  this.description = description;
  this.mpg = mpg;
  this.num = num;
  this.VIN = VIN;
}

//getter methods
public String getDescription()
{
  return description;
}

public String getMPG()
{
  return mpg;
}

public int getNumber()
{
  return num;
}

public String getVIN() {
  return VIN;
}

//toString method
public abstract String toString();

public boolean isReserved() {
  if (res != null)
   return true;
  else
   return false;
}
//Method definition of reserve
public void reserve(Reservation info) {

}

//Method definition of cancelReservation
public void cancelReservation() {
  // sets referecnce to null
  res = null;
}

public Reservation getReservation() {
  return res;
}

}