/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package date.functions;
import java.util.Scanner;
import java.sql.Date;

/**
 *
 * @author matthewbrenner
 */
public class DateFunctions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner in = new Scanner(System.in); 
         System.out.println("Enter Day");
         int day = in.nextInt();
         System.out.println("Enter Month");
         int month = in.nextInt();
         System.out.println("Enter Year");
         int year = in.nextInt();
        
         String jdate =  julian(day, month,year);
         System.out.println(jdate);
         
         System.out.println("Enter Number of Days");
         int dy = in.nextInt();
         System.out.println("Enter Year");
         int yr = in.nextInt();
        
         String normdate = fromj(dy,yr);
         System.out.println(normdate);
         
          System.out.println("Enter First Day");
          int dy1 = in.nextInt();
          System.out.println("Enter First Month");
          int mo1 = in.nextInt();
           System.out.println("Enter First Year");
          int yr1 = in.nextInt();
           System.out.println("Enter Second Day");
          int dy2 = in.nextInt();
           System.out.println("Enter Second Month");
          int mo2 = in.nextInt();
           System.out.println("Enter Second Year");
          int yr2 = in.nextInt();
         
          int diff = between(dy1,mo1, yr1, dy2, mo2, yr2);
          
        System.out.println(diff + " days between these two dates.");
    }
    
    public static String julian( int a,  int b,  int c){
       int days = a+b*30;
       String total = days + " days and " + c + " years";
       return total;
        
    }
    
      public static String fromj(int a , int b){
          int month = a/30;
          int day = a % 30;
          int yr = b;
         
          String normdate = (month) + "," + (day) + "," + (yr);
          return normdate;
          
      }     
      
      public static int between(int a, int b, int c, int d, int e, int f){
         int dys1 = a +b*30+c*365;
         int dys2 = d+e*30+f*365;
        int sub = Math.abs(dys1-dys2);
         
          return sub;
      }
    
}
