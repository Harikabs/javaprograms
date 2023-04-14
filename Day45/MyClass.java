//program for nested classes in java with static keyword
public class MyClass{
    public static void main(String[] args) {
        Rock.Nick.Duck.duckMan();
        Rock.Nick.Duck.Cheetah.rock();
        //System.out.println(Rock.Nick.Duck.Cheetah.c);



    }

}
class Rock{
    int x=10;
   static  class Nick{
        int n=4;
         static class Duck{
            int y=11;
            static int duckMan(){
                System.out.println("Duck man");
                return 0;
            }
            static class Cheetah{
                int c=duckMan();
                 static void rock(){
                    System.out.println("rock the world");
                }
            }
        }
    }
}