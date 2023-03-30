//We have a number of bunnies and each bunny has two big floppy ears. We want to compute the total number of ears across all the bunnies recursively
public class Bunnies{
public static void main(String args[]){
int n=5;
int res=ears(n);
System.out.println(res);
}
static int ears(int n){
if(n==0)
return 0;
return 2*n;
}
}
