//program for finding sum of four in the elements in the arrays
public class Four_Sum_Pair{
public static void main(String args[]){
int a[]={45,6,7,8,90,2,3,4,5,6,7,1,8,9,33,1,2,3,56};
int n =a.length;
int sum=7;
for(int i=0;i<n-3;i++){
for(int j=i+1;j<n-2;j++){
for(int k=j+1;k<n-1;k++){
for(int l=k+1;l<n;l++){
if((a[i]+a[j]+a[k]+a[l])==sum){
System.out.println(a[i]+","+a[j]+","+a[k]+","+a[l]);
return;
}
}
}
}
}
}
}



