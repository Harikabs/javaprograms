//import java.math.*;
import java.util.*;
public class BruteForce{
        static int a[][]={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
public static void main(String[] args) {

do{
    swapCells();
}while(!magicSquare());
diplay();
}


public static boolean magicSquare(){
    int sum=a[0][0]+a[0][1]+a[0][2];
    for(int i=0;i<3;i++){
        if(a[i][0]+a[i][1]+a[i][2]!=sum)
        return false;
    }
    for(int i=0;i<3;i++){
        if(a[0][i]+a[1][i]+a[2][i]!=sum)
        return false;
    }
    return (a[0][0]+a[1][1]+a[2][2]==sum&& a[0][2]+a[1][1]+a[2][0]==sum);

}
static void swapCells(){

int fisrtrow=(int)(Math.random()*3);
int fisrtcol=(int)(Math.random()*3);
int secondrow=(int)(Math.random()*3);
int secondcol=(int)(Math.random()*3);
int temp=a[fisrtrow][fisrtcol];
a[fisrtrow][fisrtcol]=a[secondrow][secondcol];
a[secondrow][secondcol]=temp;

}
static void diplay(){
    for(int i=0;i<a.length;i++){
        for(int j=0;j<a[0].length;j++){
            System.out.print(a[i][j]+" ");
        }
        System.out.println();
    }

}
}
