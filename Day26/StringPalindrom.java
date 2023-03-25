// program for checking the sting palindrom 
public class StringPalindrom{
public static void main(String args[]){
String str="scannacs";
int x=str.length();
String revstr="";
for(int i=x-1;i>=0;i--)
revstr+=str.charAt(i);
if(str.toUpperCase().equals(revstr.toUpperCase()))
System.out.println("palindrome");
else
System.out.println("not palindrome");
}
}
