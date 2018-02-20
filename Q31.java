
package q31;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.time.LocalDate;
import java.time.Period;


public class Q31 {

   
    public static void main(String[] args) {
       File que3 = new File("C:\\Users\\THAYU\\Desktop\\q3.txt");
       int count = 0;
       int z = 0;
       double temp = 0;
       double totalpurchase = 0;
       int dis = 10;
       int disyr = 10;
        try
       {
           if(!que3.exists())
           {
               que3.createNewFile();
           }
           if(!que3.exists())
           {
               que3.createNewFile();
           } 
        FileReader fr = new FileReader(que3);
        BufferedReader br = new BufferedReader(fr);
        String line1;
        while((line1 = br.readLine())!= null)
        {
            
                count = count + 1;
            
           // String date = b[5];
        }
        //System.out.println(count);
        String date[] = new String[count];
        String id[] = new String[count];
        double  max[] = new double[count];
        int years[] = new int[count];
        FileReader fr1 = new FileReader(que3);
        BufferedReader br1 = new BufferedReader(fr1);
        String line2;
        while((line2 = br1.readLine())!= null)
        {
           // System.out.println(z);
            String b[] = line2.split(",");
            String maxim = b[4];
            
            max[z] = Double.parseDouble(maxim);
            
            
            date[z] = b[5];
           
            id[z] = b[0];
          //  System.out.println(z);
            z = z + 1;         
        }
        //System.out.println(z);
        //System.out.println("completed second loop successfully");
        for(int w =0; w< count; w++)
        {     
            String start = "0000-01-01";
            LocalDate begin = LocalDate.parse(start);
            LocalDate end = LocalDate.parse(date[w]);
            years[w] = Period.between(begin,end).getYears();
            totalpurchase = max[w];
            //System.out.println(max[w]);
          for(int g = w+1; g<count; g++)
          {
              LocalDate end1 = LocalDate.parse(date[g]);
              years[g] = Period.between(begin,end1).getYears();
              if(w>0)
              {
                for(int h=w-1; h>=0; h--)
                {
                    if(years[w] == years[h])
                    {
                       disyr = 0; 
                       break;
                    }
                }
                if(disyr == 0)
              {
                  break;
              }
              if(years[w] == years[g])
              {
                  //temp = max[j];
                  //System.out.println("w " + w);
                  //System.out.println("g " + g);
                  //System.out.println(years[w] + ";" + date[w] + ";" + max[w]);
                  //System.out.println(years[g] + ";" + date[g] +  ";" + max[g]);
                  
                  totalpurchase = totalpurchase + max[g];
                  //System.out.println("first loop " + totalpurchase);
                  //System.out.println(max[w]);
                  //System.out.println(max[g]);
              }
              
              }
              else
              {
                  if(years[w] == years[g])
              {
                  //temp = max[j];
                  
                  totalpurchase = totalpurchase + max[g];
                  //max[j] = totalpurchase;
                  //System.out.println("main else " + totalpurchase);
              }
              
              }
          }
          int to = count -1;
          if(w == to)
          {
              for(int l=w-1; l>=0; l--)
                {
                    if(years[w] == years[l])
                    {
                       disyr = 0; 
                       break;
                    }
                }
                if(disyr == 0)
              {
                  break;
              }
          }
          if(disyr != 0)
          {
          System.out.println(years[w]);
          System.out.println("the total purchase in one year is " + totalpurchase + " in the year " + years[w]);
          }
          disyr = 10;
          //Sys\tem.out.println(totalpurchase + id[j] + years[j]);
          totalpurchase = 0;
        }
        for(int j =0; j< count; j++)
        {     
            String start = "0000-01-01";
            LocalDate begin = LocalDate.parse(start);
            LocalDate end = LocalDate.parse(date[j]);
            years[j] = Period.between(begin,end).getYears();
            //temp = max[j];
          for(int k = j+1; k<count; k++)
          {
              years[k] = Period.between(begin,end).getYears();
              if(j>0)
              {
                for(int q=j-1; q>=0; q--)
                {
                    if(date[j].equals(date[q]))
                    {
                       dis = 0; 
                       break;
                    }
                }
                if(dis == 0)
              {
                  break;
              }
              if(date[j].equals(date[k]) && dis != 0)
              {
                  //temp = max[j];
                  if(max[j] < max[k])
                  {
                      temp = max[k];
                      max[j] = temp;
                      
                  }
                  else
                  {
                      temp = max[j];
                  }
              }
              else
              {
                  temp = max[j];
              }
              }
              else
              {
                  if(date[j].equals(date[k]) && dis != 0)
              {
                  //temp = max[j];
                  //System.out.println(temp + " ," + max[j]);
                  if(max[j] < max[k])
                  {
                      temp = max[k];
                      max[j] = temp;
                  }
                  else
                  {
                      temp = max[j];
                  }
              }
                  else
                  {
                      temp = max[j];
                  }
              }
          }
          int to1 = count -1;
          if(j == to1)
          {
              for(int b=j-1; b>=0; b--)
                {
                    if(years[j] == years[b])
                    {
                       dis = 0; 
                       break;
                    }
                }
                if(dis == 0)
              {
                  break;
              }
                else
                {
                    temp = max[j];
                }
          }
          if(temp != 0)
          {
              System.out.println(date[j]);
          System.out.println("the highest purchase is " + temp + " in the date " +date[j]);
          }
          temp = 0;
          dis = 10;
          //Sys\tem.out.println(totalpurchase + id[j] + years[j]);
          //totalpurchase = 0;
        }
        
        
        fr.close();
        fr1.close();
        //fr2.close();
     //   fr3.close();
    }
         catch(Exception e1)
        {
            e1.printStackTrace();
        }
    }
    
}
