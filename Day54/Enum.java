enum Gender {
    MALE,
    FEMALE,
    OTHERS
};
public class Enum {
    public static void main(String[] args) {
        for(Gender g : Gender.values()){
            System.out.println(g);
        }
    }
    
}
