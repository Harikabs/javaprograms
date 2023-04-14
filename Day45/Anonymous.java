public class Anonymous

{
    public static void main(String[] args) {
        Animal a=new Animal(){
            public void makeNoise(){
                System.out.println("bow bow");
            }
            
        };
        a.makeNoise();
    }
    
}
class  Animal{
    public void  makeNoise(){
        System.out.println("make some noise");
    }
}
