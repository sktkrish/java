
package displaydet;


public class DisplayDet {

    public void display()
    {
        String name = "Thayumanavan S K";
        String dob = "1990-10-30";
        String address = "Niit Nungambakkam";
        String marital_status = "Single";
        String PG = "MBA";
        String UG = "Btech";
        System.out.println(name);
        System.out.println("date of birth is : " + dob);
        System.out.println("address is " + address);
        System.out.println("Marital status is " + marital_status);
        System.out.println(PG);
        System.out.println(UG);
    }
    public static void main(String[] args) {
        DisplayDet dd = new DisplayDet();
        dd.display();
    }
    
}
