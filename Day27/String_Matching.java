//program  for checking the given two strings 
public class String_Matching{
public static void main(String args[]){
String str="abcd";
String str1="absd";
if(str.length()!=str1.length()){
System.out.println("not matching");
return;
}
int s1=0,s2=0;
for(var x:str.toCharArray()){
s1+=x;
}
for(var y:str1.toCharArray()){
s2+=y;
}
if(s1==s2)
System.out.print("given string are matching");
else
System.out.print("given string are  not matching");
}
}
