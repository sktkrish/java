
package empdet;

import java.util.Scanner;


public class EmpDet {

    
    public static void main(String[] args) {
        int h_count = 0;
        int m_count = 0;
        int f_count=0;
        int o_count = 0;
        double h_sal = 0;
        double m_sal = 0;
        double f_sal=0;
        double o_sal= 0;
        int r_count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of employee you like to add");
        int n = sc.nextInt();
        for(int i = 0; i<n; i++)
        {
         System.out.println("Enter the employee id");
         int empid = sc.nextInt();
         System.out.println("Enter the employee name");
         String empname = sc.next();
         System.out.println("Enter the emp age");
         int empage = sc.nextInt();
         System.out.println("Enter the gender male or female");
         String gender = sc.next();
         System.out.println("Enter the city");
         String city = sc.next();
         System.out.println("Enter the country");
         String empcountry= sc.next();
         System.out.println("Enter the department in hr or marketing or finance or operations");
         String department = sc.next();
         System.out.println("Enter the marital status either single or married");
         String mari = sc.next();
         System.out.println("Enter the salary of the employee");
         double sal = sc.nextDouble();
         if(gender.equalsIgnoreCase("male"))
         {
             if(mari.equalsIgnoreCase("married"))
             {
                 System.out.println("male employee who are married are " + empname + "whose id is" + empid);
             }
         }
         else if (gender.equalsIgnoreCase("female"))
         {
             if(empcountry.equalsIgnoreCase("india"))
             {
                 System.out.println("female employee who are from Inida : " + empname);
             }
         }
         if(department.equalsIgnoreCase("hr"))
         {
             h_count = h_count + 1;
             if(sal > h_sal)
             {
                 h_sal = sal; 
             }
         }
         if(department.equalsIgnoreCase("marketing"))
         {
             m_count = h_count + 1;
             if(sal > m_sal)
             {
                 m_sal = sal; 
             }
         }
         if(department.equalsIgnoreCase("finance"))
         {
             f_count = h_count + 1;
             if(sal > f_sal)
             {
                 f_sal = sal; 
             }
         }
         if(department.equalsIgnoreCase("operations"))
         {
             o_count = h_count + 1;
             if(sal > o_sal)
             {
                 o_sal = sal; 
             }
         }
         if(empage==59)
         {
             System.out.println("employees who are going to get retired after one year : " + empname);
             r_count = r_count + 1;
         }
         
        }
        System.out.println("total count of employee in hr " + h_count);
        System.out.println("total count of employee in marketing " + m_count);
        System.out.println("total count of employee in finance" + f_count);
        System.out.println("total count of employee in operations" + o_count);
        System.out.println("highest salary of employee in hr " + h_sal);
        System.out.println("highest salary of employee in marketing " + m_sal);
        System.out.println("highest salary of employee in finance " + f_sal);
        System.out.println("highest salary of employee in operations " + o_sal);
        System.out.println("empployee who are going to retire after one year : " + r_count);
    }
    
}
