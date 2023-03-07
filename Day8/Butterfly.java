//program to print numer butterfly
public class Butterfly{
public static void main(String args[]){
int n=9;
for(int i=1;i<=n;i++){
for(int j=n;j>=n-i+1;j--)
System.out.print(j);
for(int k=1;k<=n-i;k++)
System.out.print(" ");
for(int k=1;k<=n-i-1;k++)
System.out.print(" ");
//for(int j=n;j<=i;j++)
//System.out.print(j);
for(int j=n-i+1;j<=n;j++)
System.out.print(j);
System.out.println();
}

for(int i=1;i<=n;i++){
for(int j=n;j>=i+1;j--)
System.out.print(j);
for(int k=0;k<=i-1;k++)
System.out.print(" ");

for(int k=1;k<=i-1;k++)
System.out.print(" ");
for(int j=i+1;j<=n;j++)
System.out.print(j);

System.out.println();
}
}
}






