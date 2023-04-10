public class Inheritence {
    public static void main(String args[]){
    Apple a=new Apple();
    a.appleWeight(150);
    a.colorRed();
    a.sweetTaste();
    a.acidIty();
    }   
}
 class Furits{
     void sweetTaste(){
        System.out.println("very sweet");
    }
 }
 class Apple extends Furits{
     void colorRed(){
        System.out.println("almost every apple is in red color");
    }
     void appleWeight(int x){
        System.out.println("the weight of the apple is "+x);
    }
     void acidIty(){
        System.out.println("major acid is a malic acid");
     }
}


 


