
public class Static1 {
    public static void main(String[] args) {
    System.out.println(NetWorth.x);
    NetWorth nw=new NetWorth();
    nw.collegeFee(4);  
    nw.totalWorth();
    nw.sellProperty(30000);
    NetWorth.sellPhone(2,50000);
    }
}
class NetWorth{
    static int x=100000000;
    void sellProperty(int value){
        System.out.println(x+=value);
    }
    void totalWorth(){
     System.out.println(x);
    }
    void collegeFee(int tier){
        if(tier==1)
          System.out.println(x-=190000);
        else if(tier==2)
        System.out.println(x-=100000);
        else if(tier==3)
        System.out.println(x-=400000);
        else
        System.out.println(x-=50000);
    }
     static void sellPhone(double year,int actualprice){
        int op=actualprice/100;
        if(year<1)
        System.out.println(1*50);
        else if(year>1&&year<2)
        System.out.println(op*30);
        else 
        System.out.println(op*20);
    }
}
