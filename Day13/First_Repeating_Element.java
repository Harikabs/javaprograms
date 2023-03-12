//program to find the first repeating number in the 

import java.util.*;
public class First_Repeating_Element{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
// take the input length and elements of the array
System.out.println("enter the  length of the array:");
int n=sc.nextInt();
int arr[]=new int[n];
System.out.println("enter the elements of the array:");
for(int i=0;i<n;i++)
arr[i]=sc.nextInt();
for(int i=0;i<n;i++){
int count=0;
for(int j=0;j<n;j++){
if (arr[i]==arr[j]){
count++;
}
}
if(count==2){
System.out.println("the first repeating element:"+arr[i]);
break;
}
}
}
}


