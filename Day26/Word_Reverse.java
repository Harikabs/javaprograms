//program for reversing the words in the given string
public class Word_Reverse{
public static void main(String args[]){
String str=" i love programing soo much";
int x=str.length();
for(int i=x-1;i>=0;i--){
if(str.charAt(i)==' '){
for(int j=i+1;j<x;j++)
System.out.print(str.charAt(j));
x=i;
}
}
}
}
