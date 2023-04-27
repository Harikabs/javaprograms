public class Power {
    public static void main(String[] args) {
        int x =3, y = 9;
        int res1 = pow(x,3);
        System.out.println("x is raised to the power of 3"+res1);
        int res2 = pow(y,5);
        System.out.println("y is raised to the power of 5"+res2);
    }
    static int pow(int b, int e){
        int ans = 1;
        for(int i=1; i<=e; i++)
             ans *= b;

        return ans;    
        }
    }