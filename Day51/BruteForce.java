import java.lang.Math.*;
public class BruteForce{
    public static void main(String[] args) {
        Lock lock1 = new Lock();
        for(int i=1000;i<10000;i++){
            if(lock1.checkPassCode(i))
                System.out.print("key:"+i);
        }
    }
}
class Lock {
    int passcode = (int)Math.floor((Math.random()*9000.0+1000.0));
    //0.0000000*10000 = 0
    boolean checkPassCode(int mycode){
        if(passcode==mycode)
            return true;
        return false;    
    }
}