public class InnerClass {
    public static void main(String[] args) {
        Flower.WaterFlower fw=new Flower().new WaterFlower();
        fw.lotus();
    }
}
class Flower{
    class WaterFlower{
     public void lotus(){
        System.out.println("the lotus is in rose color");
    }
    }
}
