//Given a string, compute recursively the number of times lowercase "hi" appears in the string, however do not count "hi" that have an 'x' immedately before them.
public class Count_Hi2{
public static void main(String args[]){
String str="xhihixhi";
System.out.println(countHi2(str));
}
public static int countHi2(String str) {
  if(str.length()<2)
  return 0;
  if(str.charAt(0)=='x'&&str.charAt(1)=='h')
  return countHi2(str.substring(2));
  else{
    if(str.charAt(0)=='h'&&str.charAt(1)=='i')
    return 1+countHi2(str.substring(2));
    else
    return countHi2(str.substring(1));
  }
}
}
