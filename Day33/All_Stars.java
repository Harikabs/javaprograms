//Given a string, compute recursively a new string where all the adjacent chars are now separated by a "*".
public class All_Stars{
public static void main(String args[]){
String str="howareyou";
System.out.println(allStar(str));
}
public static String allStar(String str) {
  if(str.length()==0)
  return "";
  if(str.length()==1)
  return str;
  return str.charAt(0)+"*"+allStar(str.substring(1));
}
}
