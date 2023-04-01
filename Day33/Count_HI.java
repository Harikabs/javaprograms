//Given a string, compute recursively (no loops) the number of times lowercase "hi" appears in the string.
public class Count_HI{
public static void main(String args[]){
String str="xhiyhi";
System.out.println(countHi(str));
}
public static int countHi(String str) {
  if(str.length()==0||str.length()==1)
  return 0;
  int count=0;
  if(str.substring(0,2).equals("hi"))
  count=1;
  return count+countHi(str.substring(1));
}
}
