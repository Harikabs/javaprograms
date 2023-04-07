//program for reversing the words in the given string
public class Reverse_word{
public static void main(String args[]){
String str="rock the world";
int x=0;
for(int i=0;i<str.length();i++){
if(str.charAt(i)==' '){
for(int j=i;j>=x;j--){
System.out.print(str.charAt(j));
x=i;
}
}
if(i==str.length()-1){
for (int j=str.length()-1;j>=0;j--){
System.out.print(str.charAt(j));
if(i==' ')
break;
}
}
}
}
}
