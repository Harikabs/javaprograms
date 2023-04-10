public class Program {
    public static void main(String[] args) {
    Student s=new Student();
    s.learn();
     s.teach();// when we try to call the function in the final class it shoes error
    }
    
}
final class Teacher{
     void teach(){
        System.out.println("the teacher teaches ");
    }
}
class Student extends Teacher{// when we inherit the final class it cannot be inherited 
     void learn(){
        System.out.println("the stdent learns  from the teacher");
     }
}
