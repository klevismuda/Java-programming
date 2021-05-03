package Day22_String_manipulation;

public class IndexOfExample {
    public static void main(String[] args) {
        String technologies = "java, html, css, selenium, testng, maven, cucumber";
        // find first ,
        System.out.println(technologies.indexOf(","));
        //last comma ,
        System.out.println(technologies.lastIndexOf(","));
        int indexOfJava = technologies.indexOf("java");
        System.out.println(indexOfJava);

        int idxOfCss = technologies.indexOf("css");
        System.out.println(idxOfCss);

        int indexOfCucumber = technologies.indexOf("cucumber");
        System.out.println(indexOfCucumber);

        int indexOfSQL = technologies.indexOf("SQL"); // -1 when not included
        System.out.println(indexOfSQL);

        if(technologies.contains("maven")){
            System.out.println("maven is present");
        } else {
            System.out.println("maven is present");
        }

        if(technologies.indexOf("maven") > -1){
            System.out.println("maven is present");
        } else {
            System.out.println("maven is present");
        }
    }
}
