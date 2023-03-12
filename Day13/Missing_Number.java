//program to find the missing element in the array
import java.util.*;
import java.util.Arrays;
public class Missing_Number{
public static void main(String args[]){
int  arr[]={1,5,4,6,7,2,8};
int n=8;
//method 1
int sum=0;
int  result=(n*(n+1))/2;
for(int i=0;i<arr.length;i++)
sum+=arr[i];
System.out.println("the missing number is"+(result-sum));
//method 2
for(int i=1;i<=n;i++){
int count=0;
for(int j=0;j<arr.length;j++){
if (arr[j]==i){
count++;
break;
}
}
if(count==0){
System.out.println(" the missing nummber is "+i);
return;
}
}
}
}

