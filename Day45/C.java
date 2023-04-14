public class  C{
        public static void main(String[] args) {
        new A().show();  
        }
    }
    class B{
        public void show(){
        System.out.println("the show function");
    }
    }
    class A extends B{ 
        public void sum(){
            System.out.println("the sum");
        }
    }
