public class Interface {

        public static void main(String[] args) {
        Bank b=new Bank();
        b.sub();
        b.sum(); 
        }
        
    }
    interface RBI{
        public void sum();
        public void sub();
    
        }
    interface HDFC{
        public void sub1();
    }
    class Bank  implements HDFC,RBI{
        public void sub(){
        }
        public void sub1(){

        }
        public void sum(){

        }
    
    }
    
    
