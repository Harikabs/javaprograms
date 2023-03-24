//program  for transposing matrix
import java.util.Arrays;
public class Transpose_Matrix{
public static void main(String args[]){
int a[][]={{5,7,8,9,3},
           {5,2,3,4,5},
           {3,2,4,5,6},
           {8,9,5,4,4},
           {8,7,9,0,6}};
int n=a.length;
int m=a[0].length;
int b[][]=new int[n][m];
for(int i=0;i<a.length;i++){
for(int j=0;j<a[0].length;j++){
b[i][j]=a[j][i];
}
}
System.out.println(Arrays.toString(b));
}
}
                 
           
