//program to find the length of the string using recursion
public class String_Length{
public static void main(String args[]){
String str="hello";
System.out.print(stringLength(str));
}
public static int stringLength(String str){
if(str.length()==0)
return 0;
return 1+stringLength(str.substring(1));
}
}

