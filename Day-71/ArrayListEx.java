import java.util.*;
public class ArrayListEx {   
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);
        arr.add(60);
        arr.add(70);
        arr.add(80);
        arr.add(90);
        arr.add(100);
        System.out.println(arr.get(3));
        Collections.sort(arr);
        System.out.println(arr);
    }
}
