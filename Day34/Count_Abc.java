//Count recursively the total number of "abc" and "aba" substrings that appear in the given string.
public class Count_Abc{
    public static void main(String args[]){
        String str="abcxababcxax";
        System.out.println(countAbc(str));
        }
public static int countAbc(String str) {
  if(str.length()<=2)
      return 0;
  if(str.substring(0,3).equals("abc")||str.substring(0,3).equals("aba"))
      return 1+countAbc(str.substring(2));
  else
      return countAbc(str.substring(1));    
}
}      
