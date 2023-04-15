public class Object {
    public static void main(String[] args) {
        Animal a=new Animal();
        System.out.println(a.x);
        a.dog(); 
     }
 }
 class Animal{
      int x=7;
      void dog(){
         System.out.println("bow bow");
     }
 } 
