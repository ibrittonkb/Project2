public class VehicleType extends Vehicle
{
//Constructor with parameters
   public VehicleType(String description, String mpg, int num, String VIN) {
       //calling the base class Vehicle constructor
       super(description, mpg, num, VIN);
     
   }

//toString method
   public String toString()
   {
      return "Description: "+getDescription()+ " MPG: "+getMPG()+" Num Seats :"
+getNumber()+ " VIN:"+getVIN();
                     
   }
}