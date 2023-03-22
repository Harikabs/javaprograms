//program for printing the vertical snake in the odd square matrix
public class Vertical_Snake{
public static void main (String args[]){
int a[][]={
          {1,3,4,5,6,5,7},
          {2,4,5,6,7,3,4},
          {1,4,5,6,7,3,2},
          {2,4,5,7,8,2,1},
          {2,4,6,3,2,2,3},
          {4,5,6,7,8,9,0},
          {2,3,1,2,3,2,1}};
double n=(a.length-1)/2;
for(int i=0;i<a.length;i++){
for(int j=0;j<a[i].length;j++){
if(i==0||i%2==0)
System.out.print(a[i][j]+" ");
else if((j==0&&i==n)||(j==a.length-1&&i%2!=0&&i!=n))
System.out.print(a[i][j]+" ");
else
System.out.print("  ");
}
System.out.println();
}
}
}
