//program for printing the corners sum of the matrix
public class Corners_Sum{
public static void main(String args[]){
int a[][]={
           {1,4,5,6},
           {2,4,6,8},
           {3,5,0,7},
           {2,1,4,5}};
int n=a.length;
int sum=0;
for(int i=0;i<a.length;i++){
for(int j=0;j<a[i].length;j++){
if((i==0 &&j==0)||(i==0 &&j==n-1))
sum+=a[i][j];
else if((j==0 && i==n-1)||(j==n-1 && i==n-1))
sum+=a[i][j];
}
}
System.out.println(sum);
}
}           
