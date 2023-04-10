public class Multilevel_Inheritence {
    public static void main(String args[]){
     District d=new District();
     d.about("chittoor");
     d.name("andhra pradesh");
     d.details(29);
     d.sets(29);
     System.out.println(d.gets());
    }        
    }
 class Country{
    static int s;
    public  int gets(){
        return s;
    }
    public void sets(int s){
        this.s=s;
        
    }
    public   void  details(int x){
        System.out.println("the india is part of the continent of asia");
        System.out.println("the number of states in india are "+x);

    }
}    
class State extends Country{
    public  void  name(String  y){
        System.out.println("the name of the  our state is "+y);
    }
}
class District extends State{
    public  void  about(String z){
        System.out.println("the name of our district is "+z);
    }
}