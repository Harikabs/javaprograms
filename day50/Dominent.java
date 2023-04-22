import java.util.Scanner;

public class Dominent{

        public static void main (String[] args) throws java.lang.Exception
        {
                Scanner sc=new Scanner(System.in);
                int a=sc.nextInt();
                int b=sc.nextInt();
                int c=sc.nextInt();
                if((a+b<c)||(b+c<a)||(c+a<b))
                System.out.println("yes");
                else 
                System.out.println("no");
            }
    
        }
    
