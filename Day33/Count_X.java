//Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string.
public class Count_X{
public static void main(String args[]){
String str="xuix";
int res=countX(str);
System.out.println(res);
}
public static int countX(String str) {
  
  if(str.length()==0)
  return 0;
  int count=0;
  if(str.substring(0,1).equals("x"))
  count=1;
  return count+countX(str.substring(1));
}
}
