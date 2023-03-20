public class Functions{
public static void main(String args[]){
String s1="harika";
String s2="Harika";
String s3="the only thing i know";
System.out.println(s1.equalsIgnoreCase(s2));//it ignore the case of the string and then compare
System.out.println(s1.hashCode());//it gives the hascode value of the sting
System.out.println(s1.getBytes());//it gives the byte value of the string
System.out.println(s1.indexOf('h'));// it returns the index of the specifid string 
System.out.println(s1.isEmpty());// it returns the given sting is empty or not
System.out.println(s1.matches(s2));//it returns true if it matchs the another string else it returns false
System.out.println(s1.startsWith("h"));//it checks the string starts with the given string or not 
System.out.println(s1.substring(0,3));//it creates the substring with given range of indexes 
}
}
