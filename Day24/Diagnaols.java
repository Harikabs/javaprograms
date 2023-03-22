//program for printing the  both diagnols of the odd square matrix
public class Diagnaols{
public static void main (String args[]){
int a[][]={
          {1,3,4,5,6},
          {2,4,5,6,7},
          {1,4,5,6,7},
          {2,4,5,7,8},
          {2,4,6,3,2}};
for(int i=0;i<a.length;i++){
for(int j=0;j<a[i].length;j++){
if(i==j||j==a.length-i-1)
System.out.print(a[i][j]+" ");
else
System.out.print("  ");
}
System.out.println();
}
}
}

