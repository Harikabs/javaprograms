//Given a string and a non-empty substring sub, compute recursively if at least n copies of sub appear in the string somewhere, possibly with overlapping. N will be non-negative.
public class Str_Copies{
public static void main(String args[]){
String str="howarehowthey";
String sub="how";
int n=2;
System.out.println(strCopies(str,sub));
}
public static  boolean strCopies(String str, String sub, int n) {
  int sublen=sub.length();
  int strlen=str.length();
  if(strlen<sublen){
  if(n<=0)
  return true;
  else
  return false;
  }
  if(str.substring(0,sublen).equals(sub))
  return strCopies(str.substring(1),sub,n-1);
  else
  return strCopies(str.substring(1),sub,n);
}
}

