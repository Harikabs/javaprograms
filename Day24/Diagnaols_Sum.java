//program for printing the  both diagnols  sum of the odd square matrix
public class Diagnaols_Sum{
public static void main (String args[]){
int a[][]={
          {1,3,4,5,6},
          {2,4,5,6,7},
          {1,4,5,6,7},
          {2,4,5,7,8},
          {2,4,6,3,2}};
int firstsum=0;
int secondsum=0;
for(int i=0;i<a.length;i++){
for(int j=0;j<a[i].length;j++){
if(i==j||j==a.length-i-1)
firstsum+=a[i][j];
if(j==a.length-i-1)
secondsum+=a[i][j];
}
}
System.out.println(firstsum+","+secondsum);
}
}
