//program for checking palindrome or not using recursion
public class Palindrome{
public static void main (String args[]){
String str="mam";
System.out.print(fun(str));
}
static boolean fun(String str){
int len=str.length();
if(len==0||len==1)
return true;
if(str.charAt(0)!=str.charAt(len-1))
return false;
return fun(str.substring(1,len-1));
}
}

