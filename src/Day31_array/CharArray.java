package Day31_array;

public class CharArray {
    public static void main(String[] args) {
        char[] letters = {'j', 'a', 'v', 'a', ' ', 'i', 's', ' ', 'f', 'u', 'n'};

        // print each letter using a loop
        for(char each : letters){
            System.out.print(each + " ");
        }

        String sentence = new String(letters); // String(letters) chars convert to String
        System.out.println("\nsentence = " + sentence);

        String item = "wooden spoon";
        char[] itemArray = item.toCharArray(); //  item.toCharArray(); convert String to char
        System.out.println("itemArray.length = " + itemArray.length);
        System.out.println("item.length() = " + item.length());
        //  0            1         2       3       4         5
        String[] fruits = {"bananas" , "apples", "kiwi", "mango", "papaya", "strawberry"};

        //"bananas-apples-kiwi-mango-papaya-strawberry-"
        String fruitStr = "";

        for(String each : fruits) {
            System.out.print(each +"-");
            fruitStr += each + "-";
        }

        System.out.println("\nfruitStr = " + fruitStr);

        System.out.println();

        String[] languages = {"java", "python", "c++", "sql", "ruby", "javaScript"};

        /**
         *  String.join  String[] array >>> Single String with delimiter
         *  , as concatenation
         */
        System.out.println(String.join("|" , languages));
        System.out.println(String.join("##" , languages));
        String joinedLanguages = String.join("<>" , languages);
        System.out.println(String.join("joinedLanguages = " + joinedLanguages));
    }
}
