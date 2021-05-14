package Day44_custom_classes;

public class Animal {
    String type = "Some animal";

    public void eat() {    // if write static it works with animal.eat();
        System.out.println("eating");
    }

    public void eat(String food) {
        System.out.println("eating " + food);
    }

    public void speak() {
        System.out.println("speaking");
    }

}
