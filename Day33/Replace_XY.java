//Given a string, compute recursively (no loops) a new string where all the lowercase 'x' chars have been changed to 'y' chars.
public class Replace_XY{
public static void main(String args[]){
String str="xuxxix";
System.out.println(changeXY(str));
}
public static String changeXY(String str) {
  if(str.length()==0)
  return "";
  if(str.charAt(0)=='x')
      return "y"+changeXY(str.substring(1));
  else
      return str.charAt(0)+changeXY(str.substring(1));
}
}

