package Day47_constructors;

public class StudentObject {
    public static void main(String[] args) {
        Student st1 = new Student(); //runs No-Args construction
        Student st2 = new Student(); //runs No-Args construction

        Student st3 = new Student("Klevis");
        Student str4 = new Student("Muda");

        Student st5 = new Student("Nasiba" , 28);
    }
}
