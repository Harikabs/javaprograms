public class Static{
    public static void main(String[] args) {
       System.out.println(Animal.x);
       Animal.dog(); 
    }
}
class Animal{
    static int x=7;
    static void dog(){
        System.out.println("bow bow");
    }
} 