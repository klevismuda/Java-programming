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
    //constructor with age
    public Student(int age) {
        System.out.println("age param constructor | age = " + age);
    }
    //constructor with name and age
    public Student(String name, int age) {
        System.out.println("name&age param constructor | " + name +"-"+age);
    }
}
