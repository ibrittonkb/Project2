public class Reservation
{
//Declare variables
   private String companyName;
   private String creditCardNum;
   private String rentalPeriodType;
   private String rentalTime;
//Constructor with parameters
   public Reservation(String companyName,String creditCardNum,
           String rentalPeriodType,String rentalTime)
   {
       this.companyName=companyName;
       this.creditCardNum=creditCardNum;
       this.rentalPeriodType=rentalPeriodType;
       this.rentalTime=rentalTime;
   }
//getter methods
   public String getCompanyName()
   {
       return companyName;
   }
   public String getCreditCardNum()
   {
       return creditCardNum;
   }
   public String getRentalPeriodType()
   {
       return rentalPeriodType;
   }
   public String getRentalTime()
   {
       return rentalTime;
   }
//toString method
   public String toString() {

       return getCompanyName()+" "+getCompanyName()+" "
               +getRentalPeriodType()+" "+getRentalTime();
   }

}
//VehicleType class which extends the Vehicle abstract class
//and override the toString method.