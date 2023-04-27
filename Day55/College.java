public class College {
    public static void main(String[] args) {
        Sub_Class sc = new Sub_Class();
        sc.ece();
        sc.cse();

    }
    
}
 class Sub_Class {
    public void cse(){
        System.out.println(" this is computer science");
        college();
    }
    public void ece() {
        System.out.println("this is electronics");
        college();
        
    }
    public void college(){
        System.out.println("IIT madras");
    }
}
