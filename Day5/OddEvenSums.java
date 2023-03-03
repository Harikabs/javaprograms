public class OddEvenSums{
public static void main(String args[]){
int arr[]={67,3,4,5,6,7,8,9,2};
int OddSum=0;
int EvenSum=0;
for (int x:arr){
if (x%2==0)
EvenSum+=x;
else
OddSum+=x;
}
System.out.println(EvenSum);
System.out.println(OddSum);
}
}

