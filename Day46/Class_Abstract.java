public class Class_Abstract {

        public static void main(String[] args) {
            Animal a=new Animal(){
                public void makeNoise(){
                    System.out.println("bow bow");
                }
                
            };
            a.makeNoise();
        }
        
    }
    class Animal{
        public void  makeNoise(){
            System.out.println("the class is");
        }
        }
    
    

