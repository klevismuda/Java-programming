package day53_inheritance.Hidding;

public class Mobile extends Phone{
    String type = "Mobile phone";
    /**
    Method hiding
     we are hiding use() static method
     */
    //@Override

    public static void use(){
        System.out.println("using mobile phone");
    }

    public void text(){
        use();
        System.out.println("and sending a text message");
    }

    @Override
    public void call(){
        use();
        System.out.println("and calling on mobile");
    }
}
