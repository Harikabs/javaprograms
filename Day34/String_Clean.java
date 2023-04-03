//Given a string, return recursively a "cleaned" string where adjacent chars that are the same have been reduced to a single char. So "yyzzza" yields "yza".
public class String_Clean{
    public static void main(String args[]){
        String str="aasshello";
        System.out.println(stringClean(str));
        }
        public static String stringClean(String str) {
           if(str.length()<=1)
              return str;
           if(str.charAt(0)==str.charAt(1))
              return stringClean(str.substring(1));
           else   
              return str.charAt(0)+stringClean(str.substring(1));
} 
}
