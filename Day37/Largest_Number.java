//program for printing the largest number with n-1 digits
public class Largest_Number{
public static void main(String args[]){
int n=3462;
int max=0;
int place=1;
while(n/place>0){
int num=n/(place*10)*place+n%place;
System.out.println(num);
if(num>max)
max=num;
place*=10;
}
}
}
