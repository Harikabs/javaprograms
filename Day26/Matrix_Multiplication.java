//program for multiplication of two matrixes
public class Matrix_Multiplication{
public static void main(String args[]){
int a[][]={{3,4},
           {6,7}};
int b[][]={{7,8},
            {5,3}
          };
int x=a.length;
int y=b.length;
for(int i=0;i<x;i++){
for(int j=0;j<y;j++){
int c[][]=new int[x][y];
for(int k=0;k<y;k++){
c[i][j]+=a[i][k]*b[k][j];
}
System.out.print(c[i][j]+" ");
}
System.out.println();
}
}
}                      
