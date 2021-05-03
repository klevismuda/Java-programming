package Day19_class_vs_object_String;

public class StringCaseConversion {
    public static void main (String[]args){
    String word = "CyberTek School";
        System.out.println(word);
        System.out.println(word.toLowerCase());
        System.out.println("JaVa".toLowerCase());
        System.out.println(word.toUpperCase());

        word.toLowerCase();
        System.out.println(word);  // it wont change
        //change word to all lower case letters
        word = word.toLowerCase();
        System.out.println("new word " +word);

        String company = "Amazon";
        System.out.println("Company to upper case " +company.toUpperCase());
        company = company.toUpperCase();   // reassign as AMAZON
        System.out.println("Company to upper case " +company);
}
}