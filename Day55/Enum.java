enum TShirtSize {
    SMALL(), MEDIUM("medium"), LARGE("large","largeman"), XTRALARGE("xtralarge");
    TShirtSize() {
        System.out.println(" you have seleted ");
    }
    TShirtSize(String str) {
        System.out.println("you have selected "+str);
    }
    TShirtSize(String str, String str2){
        System.out.println(" you have selected"+str);
    }
    void print(){
        System.out.println(" I'm the man!");
    }
}
public class Enum {
    public static void main(String[] args) {
        var mytshirtSize = TShirtSize.LARGE;
        System.out.println(mytshirtSize);
    }
    
}
