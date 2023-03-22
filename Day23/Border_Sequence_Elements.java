// program for printing  the border elements in the 2d array
public class Border_Sequence_Elements{
public static void main (String args[]){
int a[][]={
          {1,3,4,5,6},
          {2,4,5,6,7},
          {1,4,5,6,7},
          {4,5,6,7,2}
          };
for(int i=0;i<a.length;i++){
for(int j=0;j<a[i].length;j++){
if(i==0||j==a[i].length-1)
System.out.print(a[i][j]);
}
}
for(int i=0;i<a.length;i++){
for(int j=a[i].length-1;j>=0;j--){
if(i==a.length-1 &&j!=a[0].length-1)
System.out.print(a[i][j]);
}
}
for(int i=a.length-2;i>0;i--){
for(int j=0;j<a[i].length;j++){
if(j==0)
System.out.print(a[i][j]);
}
}
}
}   
 
