
package file1q1;

import java.util.*;
import java.io.*;
public class File1Q1 {

   
    public static void main(String[] args) {
        String id[] = new String[10];
        String id1[] = new String[10];
        String name[] = new String[10];
        int stage[] = new int[10];
        String age[] = new String[10];
        String city[] = new String[10];
        String stCountry[] = new String[10];
        char numb[] = {'0','1','2','3','4','5','6','7','8','9'};
        int n = 0;
        int count = 0;
        File que1 = new File("C:\\Users\\THAYU\\Desktop\\q1.txt");
        FileWriter fw = null;
        BufferedWriter bw = null;
        FileReader fr = null;
        BufferedReader br = null;
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<10; i++)
        {
            System.out.println("Enter id starting with s and followed by 3 digits");
            id[i] = sc.next();
            n = i;
            if(id[i].charAt(0) == 's' || id[i].charAt(0) == 'S')
            {
                System.out.println("Enter the 1st condition");
                if(id[i].length() == 4)
                {
                    System.out.println("Enter the 2nd condition");
                   
                    for(int j = 0; j<numb.length; j++)
                    {
                        
                        if(id[i].charAt(1) == numb[j])
                        {
                            System.out.println("Enter the 3rd condition");
                            for(int k = 0; k<numb.length; k++)
                            {
                                if(id[i].charAt(2) == numb[k])
                                {
                                    System.out.println("Enter the 4th condition");
                                    for(int z = 0; z< numb.length; z++)
                                    {
                                        if(id[i].charAt(3) == numb[z])
                                        {
                                            System.out.println("Enter the 5th condition");
                                            id1[i] = id[i];
                                            System.out.println(id1[i]);
                                            System.out.println("Enter the name");
            name[i] = sc.next();
            System.out.println("Enter the age");
            stage[i] = sc.nextInt();
            if(stage[i] < 100)
            {
                age[i] = Integer.toString(stage[i]);
                System.out.println("Enter the city");
            city[i] = sc.next();
            System.out.println("Enter the country");
            stCountry[i] = sc.next();
            if(stCountry[i].equals("India"))
            {
             try
       {
           if(!que1.exists())
           {
               que1.createNewFile();
           }
           if(!que1.exists())
           {
               que1.createNewFile();
           } 
           fw = new FileWriter(que1.getAbsoluteFile(), true); 
                  bw = new BufferedWriter(fw);
                  bw.write(id1[i]);
                  bw.write(",");
                  bw.write(name[i]);
                  bw.write(",");
                  bw.write(age[i]);
                  bw.write(",");
                  bw.write(city[i]);
                  bw.write(",");
                  bw.write(stCountry[i]);
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
            
                                        }
                                        
                                        
                                    }
                                    
                                    
                                }
                                
                            }
                           
                        }
                        
                    }
                    
                }
               
                
                
                
            }
            
            
                    }
        

    }
        try
       {
           if(!que1.exists())
           {
               que1.createNewFile();
           }
           if(!que1.exists())
           {
               que1.createNewFile();
           } 
        fr = new FileReader(que1);
        br = new BufferedReader(fr);
        
        
        int c;
        String line1;
        while((line1 = br.readLine())!= null)
        {
            System.out.println("While loop");
            //String line = br.readLine();
            String b[] = line1.split(",");
            int ag = Integer.parseInt(b[2]);
            System.out.println(ag);
            if(ag > 21)
            {
                count = count + 1;
            }
            if(b[1].charAt(0) == 'A' || b[1].charAt(0) == 'a')
            {
                System.out.println(b[1]);
            }
            
        }
        
        System.out.println("Number of students whose age above 21 are " + count);
        fr.close();
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