package Day47_constructors;

public class Student {
    //No args constructor
    public Student(){
        System.out.println("No-Args construction");
    }
    // Overloading Constructor with 1 param: String name
    public Student(String name){
        System.out.println("Name param constructor | name " + name);


    }
}
