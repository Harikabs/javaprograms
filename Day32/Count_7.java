//Given a non-negative int n, return the count of the occurrences of 7 as a digit, so for example 717 yields 2. (no loops). Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
public class Count_7{
public static void main(String args[]){
int n=79787;
int res=count7(n);
System.out.println(res);
}
public static int count7(int n) {
  if(n==0)
      return 0;
  if(n%10==7)
      return 1+count7(n/10);
      
  return 0+count7(n/10);    
}
}

