//Given a string, compute recursively a new string where identical chars that are adjacent in the original string are separated from each other by a "*".
public class Pair_Stars{
public static void main(String args[]){
String str="helloyoou";
System.out.println(pairStar(str));
}
public static String pairStar(String str) {
  if(str.length()==1||str.length()==0)
  return str;
  if(str.charAt(0)==str.charAt(1))
  return str.charAt(0)+"*"+pairStar(str.substring(1));
  else
  return str.charAt(0)+pairStar(str.substring(1));
}
}

