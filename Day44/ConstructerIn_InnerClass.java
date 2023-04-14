public class ConstructerIn_InnerClass {
        public static void main(String[] args) {
            Rock r=new Rock();        
        }
 
}
class Rock{
    Rock(){
        this(11);

        System.out.println("0 parameter");
    }
    Rock(int x){
        System.out.println("1 parameter");
    }
    Rock(int x,int y){
        System.out.println(" 2 parameters");
    }
}

