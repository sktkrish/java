
package fileq2;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;

public class FileQ2 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        String mid;
        String mname;
        String mdir;
        String mrat;
        int mrating;
        String mtype;
        String rdate = null;
        File que2 = new File("C:\\Users\\THAYU\\Desktop\\q2.txt");
        FileWriter fw = null;
        BufferedWriter bw = null;
        FileReader fr = null;
        BufferedReader br = null;
         for(int i = 0; i< 50; i++)
       {
           System.out.println("Enter the movie id");
           mid = sc.next();
           //mname = sc.nextLine();
           System.out.println("Enter the movie name");
           mname = sc.next();
           //mdir = sc.nextLine();
           System.out.println("Enter the movie director");
           mdir = sc.next();
           System.out.println("Enter the rating in 0-10");
           mrating = sc.nextInt();
           mrat = Integer.toString(mrating);
           System.out.println("Enetr how many actors you like to enter");
           int t = sc.nextInt();
           String actor[] = new String[t];
           for(int j = 0; j<t ; j++)
           {
               //actor[j] = sc.nextLine();
           System.out.println("Enter the name of actor");
           actor[j] = sc.next();
           }
           /*if(actor[j].equals("AmitabhBachhan"))
           {
               count = count + 1;
               System.out.println("count is " + count);
           }*/
           
           
           /*if(director.equals("KaranJohar"))
           {
               dir_count = dir_count + 1;
               System.out.println("count of dir is" + dir_count);
           }*/
           
           
           
           
          
           System.out.println("Enter the movie type either U or A or U/A or A");
           mtype = sc.next();
           System.out.println("enter movie release date in yyyy-mm-dd");
           rdate = sc.next();
           
           /*if(rating > 5)
           {
               rat_count = rat_count + 1;
           }*/
           try
       {
           if(!que2.exists())
           {
               que2.createNewFile();
           }
           if(!que2.exists())
           {
               que2.createNewFile();
           } 
           fw = new FileWriter(que2.getAbsoluteFile(), true); 
                  bw = new BufferedWriter(fw);
            //bw.newLine();
           bw.write(mid);
           bw.write(",");
           bw.write(mname);
           bw.write(",");
           bw.write(mdir);
           bw.write(",");
           for(int k = 0; k<t; k++)
           {
           bw.write(actor[k]);
           int n = t-1;
           if(k != n)
           bw.write(" ");
           }
           bw.write(",");
           bw.write(mrat);
           bw.write(",");
           bw.write(mtype);
           bw.write(",");
           bw.write(rdate);
           //bw.write(",");
            bw.newLine();
                  bw.flush();
                  bw.close();
                  fw.close();
           
            }
             catch(Exception e)
       {
           e.printStackTrace();
       }
       finally
       {
           try
           {
               if(bw != null)
               {
                   bw.close();
               }
               if(fw != null)
               {
                   fw.close();
               }
           }
           catch(IOException ex)
           {
            ex.printStackTrace();
           }   
       }
           
       }
         try
       {
           if(!que2.exists())
           {
               que2.createNewFile();
           }
           if(!que2.exists())
           {
               que2.createNewFile();
           } 
        fr = new FileReader(que2);
        br = new BufferedReader(fr);
        String line1;
        while((line1 = br.readLine())!= null)
        {
            //System.out.println("While loop");
            //String line = br.readLine();
            String b[] = line1.split(",");
            String mdate = b[6];
            String start = "0000-01-01";
            LocalDate begin = LocalDate.parse(start);
            LocalDate end = LocalDate.parse(mdate);
            int years = Period.between(begin,end).getYears();
            
            if(years == 2015)
            {
                System.out.println("The movie " + b[1] + " is released in 2015");
            }
        }
        FileReader fr1 = new FileReader(que2);
        BufferedReader br1= new BufferedReader(fr1);
        String line2;
        while((line2 = br1.readLine())!= null)
        {
            //System.out.println("2nd while loop");
            String c[] = line2.split(",");
            if(c[5].equals("U")|| c[5].equals("u"))
            {
                System.out.println("The movie " + c[1] + " has U certificate ");
            }
        }
        FileReader fr2 = new FileReader(que2);
        BufferedReader br2= new BufferedReader(fr2);
        String line3;
        while((line3 = br2.readLine())!= null)
        {
            String d[] = line3.split(",");
            int rate = Integer.parseInt(d[4]);
            if(rate > 4)
            {
                System.out.println("The movie " + d[1] + " has ratings " + rate);
            }
        }
        FileReader fr3 = new FileReader(que2);
        BufferedReader br3= new BufferedReader(fr3);
        String line4;
        while((line4 = br3.readLine())!= null)
        {
            String e[] = line4.split(",");
            for(String s: e[3].split("\\s"))
            {
                if(s.contains("khan") || s.contains("Khan"))
                {
                    System.out.println("The movie " + e[1] + " has actors " + e[3]);
                }
            }
        }
        fr.close();
        fr1.close();
        fr2.close();
        fr3.close();
    }
         catch(Exception e1)
        {
            e1.printStackTrace();
        }
        finally
       {
           try
           {
               if(br != null)
               {
                   br.close();
               }
               if(fr != null)
               {
                   fr.close();
               }
           }
           catch(IOException ex1)
           {
            ex1.printStackTrace();
           }   
       }
    
}
}
