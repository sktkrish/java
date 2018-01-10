import java.time.LocalDate;
import java.time.Period;
import java.util.*;
class DateOfBirth
{
  public static void main(String []args)
   {
     Scanner sc = new Scanner(System.in);
     for(int i =0; i<10; i++)
     {
     System.out.println("Enter Stundent Name");
     String name = sc.next();
     System.out.println("Emter your date of birth in yyyy-mm-dd format");
     String dob = sc.next();
     LocalDate start = LocalDate.parse(dob);
     LocalDate end = LocalDate.now();
     long years = Period.between(start,end).getYears();
     System.out.println(years);
     if(years > 18)
      {
        System.out.println("He/she is eligible for voting");
      }
     else
      {
        System.out.println("He/she is not eligible for voting");
      }
     }
   }
}