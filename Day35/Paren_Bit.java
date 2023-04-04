//Given a string that contains a single pair of parenthesis, compute recursively a new string made of only of the parenthesis and their contents, so "xyz(abc)123" yields "(abc)".
public class Paren_Bit{
public static void main(String args[]){
String str="how(are)they";
System.out.println(parenBit(str));
}
public  static String parenBit(String str) {
  if(str.charAt(0)=='('){
    int n=str.length();
    if(str.charAt(n-1)==')')
    return str;
    else
    return parenBit(str.substring(0,n-1));
  }
  else{
        return parenBit(str.substring(1));
     }
  }
}
