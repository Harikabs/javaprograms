//Given an array of ints, compute recursively the number of times that the value 11 appears in the array. We'll use the convention of considering only the part of the array that begins at the given index. In this way, a recursive call can pass index+1 to move down the array. The initial call will pass in index as 0.
public class Count_Array11{
public static void main(String args[]){
int arr[]={4,6,11,6,11,3,6};
int index=0;
System.out.println(array11(arr,index));
}
public static int array11(int[] nums, int index) {
  if(index==nums.length)
  return 0;
  int count=0;
  if(nums[index]==11)
  count =1;
  return count+array11(nums,index+1);
}
}
