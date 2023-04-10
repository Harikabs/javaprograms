public class Hirarical {
    public static void main(String[] args) {
    Parrat.color("green");
    Peacock.colors("blue", "green");   
    Parrat.fly();
    Peacock.wings(2);
    }
    
}
class Bird{
    static void fly(){
        System.out.println("the birds fly in the sky");
    }
    static void wings(int y){
        System.out.println("the wings of the birds "+y);
    }  
}
class Parrat extends Bird{
    static void color(String s){
        System.out.println(" the color of the parrot is "+s);
    }
}
class Peacock extends Bird{
    static void colors(String x,String y){
        System.out.println("the colors of the peacock is "+x+y);
    }
}
