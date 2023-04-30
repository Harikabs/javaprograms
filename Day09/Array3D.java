public class Array3D{
public static void main(String args[]){
System.out.println(" array is:");
int arr[][][]={
{{4,5,5},{3,6,7}},
{{5,8,6},{6,8,9}}
};
for( int x[][]:arr){
for(int y[]:x){
for(int z:y)
System.out.print(z+ " ");
System.out.println();
}
}
}
}

