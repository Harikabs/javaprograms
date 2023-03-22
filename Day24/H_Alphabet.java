//program for printing the H alphabet in  the odd square matrix
public class H_Alphabet{
public static void main (String args[]){
int a[][]={
          {1,3,4,5,6},
          {2,4,5,6,7},
          {1,4,5,6,7},
          {2,4,5,7,8},
          {2,4,6,3,2}};
double n=(a.length-1)/2;
for(int i=0;i<a.length;i++){
for(int j=0;j<a[i].length;j++){
if(j==0||j==a.length-1)
System.out.print(a[i][j]+" ");
else if(i==n)
System.out.print(a[i][j]+" ");
else if(i==a.length-1 &&j==a.length-1)
System.out.print(a[i][j]+" ");
else
System.out.print("  ");
}
System.out.println();
}
}
}

