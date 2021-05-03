package Day20_String_Manipulation;

public class StringIsEmpty {
    public static void main(String[] args) {
        String jobTitle = "";
        System.out.println(jobTitle.isEmpty());
        System.out.println(jobTitle.length());// is 0 because no character.
        System.out.println(jobTitle.length() == 0); //true
        System.out.println(jobTitle.equals(""));
        System.out.println(jobTitle.equalsIgnoreCase(" "));

        String veggie = "carrots";
        String result = (!veggie.isEmpty()) ? ("we have "+ veggie) : ("we don't have " + veggie);

        System.out.println(result);

        if (jobTitle.isEmpty()) {
            System.out.println("JobTitle is missing, please resend");
        }else {
            System.out.println("Job title looks good");
        }

        if(jobTitle.length() == 0) {
            System.out.println("jobTitle is empty");
        }else {
            System.out.println("job title is not empty");
        }

        System.out.println(jobTitle.equals(""));

        if("".equals(jobTitle)) {
            System.out.println("Job title is empty");
        }else {
            System.out.println("job title is not empty");
        }

        String word = " ";
        System.out.println(word.isEmpty());//false
        System.out.println(word.length()); //1. blank space is a character

        String veggie2 = "carrots";
        System.out.println(veggie2.isEmpty()); //false
        //if veggie IS NOT EMPTY, print we have carrots
        if(!veggie.isEmpty()) {
            System.out.println("we have " + veggie);
        }

        String word2;
        // System.out.println(word2.isEmpty()); ERROR. Not initialized
    }
}
