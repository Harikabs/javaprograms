//program  for subtraction of two matrixes
//import java.util.Arrays;
public class 

Addition_Matrix{
public static void main(String args[]){
int a[][]={{8,9,3},
           {5,4,5},
           {3,2,4}};
int b[][]={{7,3,4},
           {8,4,5},
           {6,8,9}}; 
int n=a.length;
int m=a[0].length;
int res[][]=new int[n][m];
for(int i=0;i<n;i++){
for(int j=0;j<m;j++){
res[i][j]=a[i][j]+b[i][j];
}
}
for(var x:res)
{
for(var y:x)
System.out.print(y+" ");
System.out.println();
}

}
}
                 
           
