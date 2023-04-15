public class InterfaceAbstract {
    

        public static void main(String[] args) {
            Animal a=new Animal(){
                public void makeNoise(){
                    System.out.println("bow bow");
                }
                
            };
            a.makeNoise();
        }
        
    }
    interface Animal{
        public void  makeNoise();
        }
    
    
