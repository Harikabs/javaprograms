//program for reversing the string
public class Reverse_String{
public static void main(String args[]){
String str="rock the world";
String res="";
char arr[]=str.toCharArray();
for(int i=arr.length-1;i>=0;i--){
res+=arr[i];
}
System.out.println(res);
}
}
