import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        
        if(s.charAt(8)=='P')
            {
            
           // String hour =  new StringBuilder().append(s.charAt(0)).append( s.charAt(1)).toString();
            String hour = ""+s.charAt(0) +s.charAt(1);
            int val = Integer.parseInt(hour);
            if(val !=12) 
            {val=val+12;}
            System.out.println(val + s.substring(2,8));
        }
        else
            {
            String hour = ""+s.charAt(0) +s.charAt(1);
            int val = Integer.parseInt(hour);
            if(val==12)
            {System.out.println("00"+ s.substring(2,8));}
            else
                System.out.println( s.substring(0,8));
        }
    }
}