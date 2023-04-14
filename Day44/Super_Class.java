public class Super_Class {
    
        public static void main(String[] args) {
            Rock r=new Rock();
            Mock m=new Mock();
        
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
class Mock extends Rock{
    Mock(){
        super(11,88);

    }
}


