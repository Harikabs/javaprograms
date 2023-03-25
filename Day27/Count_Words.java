//program to find how many words in the String
public class Count_Words{
public static void main(String args[]){
String str="Every thing happens for a reason";
int words=0;
for(var x:str.toCharArray()){
if(x==' ')
words++;
}
System.out.println(words+1);
}
}

