public class New {
        static int a[][]={
            {1,2,3,4},
            {7,5,6,8},
            {9,10,11,12},
            {14,13,15,16}
        };
public static void main(String[] args) {

do{
    swapCells();
}while(!magicSquare());
diplay();
}


public static boolean magicSquare(){
    int sum=a[0][0]+a[0][1]+a[0][2]+a[0][3];
    for(int i=0;i<4;i++){
        if(a[i][0]+a[i][1]+a[i][2]+a[i][3]!=sum)
        return false;
    }
    for(int i=0;i<4;i++){
        if(a[0][i]+a[1][i]+a[2][i]+a[3][i]!=sum)
        return false;
    }
    return (a[0][0]+a[1][1]+a[2][2]+a[3][3]==sum&& a[0][3]+a[1][2]+a[2][1]+a[3][0]==sum);

}
static void swapCells(){

int fisrtrow=(int)(Math.random()*4);
int fisrtcol=(int)(Math.random()*4);
int secondrow=(int)(Math.random()*4);
int secondcol=(int)(Math.random()*4);
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

