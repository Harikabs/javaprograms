//program to find the missing element in the array
import java.util.*;
import java.util.Arrays;
public class Missing_Number{
public static void main(String args[]){
int  arr[]={1,5,4,6,7,5,2,8};
int n=8;
for(int i=1;i<=n;i++){
int count=0;
for(int j=0;j<arr.length;j++){
if (arr[j]==i){
count++;
break;
}
}
if(count==0){
System.out.println(i);
return;
}
}
}
}

