//Given a string, return true if it is a nesting of zero or more pairs of parenthesis, like "(())" or "((()))". Suggestion: check the first and last chars, and then recur on what's inside them.
public class Nest_Paren{
public static void main(String args[]){
String str="(((((y))))";
System.out.println(nestParen(str));
}
public static boolean nestParen(String str) {
  if(str.length()==0)
  return true;
  if(str.length()%2==1)
  return false;
  else{
    if(str.charAt(0)=='(' && str.charAt(str.length()-1)==')')
    return nestParen(str.substring(1,str.length()-1));
    else
    return false;
  }
}
}
