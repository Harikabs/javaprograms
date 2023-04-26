enum Coffe {
    SMALL,
    LARGE,
    MEDIUM;
};
public class Enum1 {
    public static void main(String[] args) {
        Coffe myCoffe = Coffe.SMALL;
        switch(myCoffe){
            case SMALL :
                System.out.println("you ordered a small cup of coffe");
                break;
            case MEDIUM :
                System.out.println("you ordered a medium cup of coffe");
                break;
            default:
                System.out.println("invalid size");    


        }
    }
}
