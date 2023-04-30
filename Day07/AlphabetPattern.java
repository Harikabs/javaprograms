import java.util.*;
public class AlphabetPattern{
public static void main(String args[]){
int n=5;
int alphabet=65;
for(int i=1;i<=n;i++){
for(int j=0;j<=i;j++)
System.out.print((char)(alphabet+j)+" ");
System.out.println();
}
}
}


