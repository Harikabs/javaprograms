public class Cipher {
   static char arr[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    public static void main(String[] args) {
    String cipher="olssv dvysk";
    decode(cipher);
    }
    static void decode(String str){
         String cipher="";
        for(int i=1;i<=25;i++){
            for(int j=0;j<str.length();j++){
                if(!(str.charAt(j)== ' ')){
                    int ind=str.charAt(j)-97-i;
                    int curNow=ind%26;
                    if(curNow<0)
                    curNow+=26;
                    System.out.print(arr[curNow]);
                }
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }  
}
