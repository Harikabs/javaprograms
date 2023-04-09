package Pack1;
import Pack2.*;
import  Pack2.Fox;
import  Pack2.Horse;
import  Pack2.Mock;
import  Pack2.subpack1.Giraffe;
import  Pack2.subpack1.Goat;
import Pack2.Mock;

public class Hello{
    public static void main(String args[]){
        Mock m=new Mock();
        m.sayMeow(8);
       Giraffe g=new Giraffe();
        g.sayHello(5);
        Goat p=new Goat();
        p.goatNum(7);
        Horse h=new Horse();
        h.tukTuk(8);
        Fox f=new Fox();
        f.heyFox();
        System.out.println(Rock.rockWorld());

        
    }

}