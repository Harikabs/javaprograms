//Given a string, compute recursively a new string where all the 'x' chars have been removed.
public class No_X{
public static void main(String args[]){
String str="xhellox";
System.out.println(noX(str));
}
public static String noX(String str) {
  if(str.length()==0)
return "";
if(str.charAt(0)=='x')
return noX(str.substring(1));
return str.charAt(0)+noX(str.substring(1));
}
}
