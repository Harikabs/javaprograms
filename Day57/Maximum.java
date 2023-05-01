import java.util.*;
public class Maximum {

        public static void main (String[] args) throws java.lang.Exception {
        
            Scanner hh = new Scanner(System.in);
            
            int a = hh.nextInt();
            int b = hh.nextInt();
            int c = hh.nextInt();
            int x = Math.max(Math.max(a,b),c);
            System.out.println(x);
            hh.close();
        }
    }
    
