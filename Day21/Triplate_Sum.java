//program for finding the 3 elements that are equal to addition three elements in the array
public class Triplate_Sum{
public static void main(String args[]){
int a[]={45,6,7,8,90,2,3,4,5,6,7,1,8,9,33,1,2,3,56};
int n =a.length;
int sum=50;
for(int i=0;i<n-2;i++){
for(int j=i+1;j<n-1;j++){
for(int k=j+1;k<n;k++){
if(a[i]+a[j]+a[k]==sum){
System.out.println(a[i]+","+a[j]+","+a[k]);
return;
}
}
}
}
}
}


