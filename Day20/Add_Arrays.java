// program to adding two equal length arrays
public class Add_Arrays{
public static void main(String args[]){
int a[]={3,5,6};
int b[]={1,2,1,1,1};
int sum=0;
for(int i=0;i<a.length;i++){
sum+=a[i];
}
for(int j=0;j<b.length;j++){
sum+=b[j];
}
System.out.println(sum);
}
}
