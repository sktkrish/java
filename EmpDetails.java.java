import java.util.*;
public class EmpDetails
{
 public static void main(String []args)
  {
    int empId;
    String empName;
    double sal;
    double amt = 0;
    double high = 0;
    double tot = 0;
        Scanner sc = new Scanner(System.in);
    for(int i = 0; i < 10; i++)
      {
        System.out.println("Enter empid");
        System.out.println("Enter empName");
         System.out.println("enter sal");
        

        empId = sc.nextInt();
        empName = sc.next();
        sal = sc.nextDouble();
        for(int j =0; j< 10; j++)
          {
            amt = sal * 1.1;
            System.out.println(amt);
            sal = amt;
           }
        System.out.println("sal is " + amt);
        if (high < amt)
          {
            high = amt;
          }
          
      }
        System.out.println("the highest sal is " + high);
}
}