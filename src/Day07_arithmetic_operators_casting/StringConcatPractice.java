package Day07_arithmetic_operators_casting;

public class StringConcatPractice {
    public static void main(String[] args) {
        System.out.println("Java"+5+3); //Java53
        System.out.println("Java"+(5+3)); //Java8
        System.out.println(5+3+"Java");//8Java
        System.out.println(5+(3+"Java"));//53Java
        System.out.println("hello"+1+2+3); //hello123
        System.out.println("hello"+(1+2+3)); //hello123
        String str1="hello";
        String str2="friends";
        System.out.println(str1+str2); //hellofriends
        System.out.println(str1+" "+str2); //hello friends
        int num1=7;
        int num2=8;
        System.out.println(num1+num2); //15
        System.out.println(num1+" "+num2);

        char char1='a';
        char char2='b';
        System.out.println(char1+char2); //97+98=195
        System.out.println(char1+""+char2);//ab



    }
}
