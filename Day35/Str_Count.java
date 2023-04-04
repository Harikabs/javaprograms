//Given a string and a non-empty substring sub, compute recursively the number of times that sub appears in the string, without the sub strings overlapping.
public class Str_Count{
public static void main(String args[]){
String str="howarehowthey";
String sub="how";
System.out.println(strCount(str,sub));
}
public static int strCount(String str, String sub) {
  int sublen=sub.length();
  if(str.length()<sub.length())
  return 0;
  if(str.substring(0,sublen).equals(sub))
  return 1+strCount(str.substring(sublen),sub);
  return 0+strCount(str.substring(1),sub);
}
}
