// program for printing sum of  the border elements in the 2d array
public class Border_Elements_Sum{
public static void main (String args[]){
int a[][]={
          {1,3,4,5,6},
          {2,4,5,6,7},
          {1,4,5,6,7}};
int sum=0;
for(int i=0;i<a.length;i++){
for(int j=0;j<a[i].length;j++){
if(i==0||j==0||i==a.length-1||j==a[i].length-1){
sum+=a[i][j];
}
}
}
System.out.println(sum);
}
}
