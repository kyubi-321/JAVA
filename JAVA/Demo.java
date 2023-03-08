package JAVA; 

public class Demo {
    public static void main(String[] args){

        student st1;
        st1 = new student();

        st1.studentName = "Ram";
        st1.studentId = 123;
        st1.studentCity = "Ayodhya";

        st1.study();
        st1.showFullDetails();
    }
    
}
