//program for changing th first letter in the word to capitalcase
public class Camel_Case{
public static void main(String args[]){
String str="programming needs logic building";
int n=str.length();
char x[]=str.toCharArray();
int c=0;
int y=0;
x[0]=Character.toUpperCase(x[0]);
for(int i=0;i<n-1;i++){
if(x[i]==' '){
c++;
x[i+1]=Character.toUpperCase(x[i+1]);
}
else{
x[y++]=x[i];
}
}
System.out.println(x);
}
}
