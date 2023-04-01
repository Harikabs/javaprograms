//Given an array of ints, compute recursively if the array contains a 6. We'll use the convention of considering only the part of the array that begins at the given index. In this way, a recursive call can pass index+1 to move down the array. The initial call will pass in index as 0.
public class Count_Array6{
public static void main(String args[]){
int arr[]={4,6,5,6,7,3,6};
int index=0;
System.out.println(array6(arr,index));
}
public static boolean array6(int[] nums, int index) {
  if(index>=nums.length)
      return false;
  if(nums[index]==6)
  return true;
  else
  return array6(nums,index+1);
}
}
