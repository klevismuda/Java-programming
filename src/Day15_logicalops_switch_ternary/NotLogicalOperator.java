package Day15_logicalops_switch_ternary;

public class NotLogicalOperator {
    public static void main(String[] args) {
        System.out.println("!true = " + (!true));
        System.out.println("!false = " + (!false));

        int age = 20;
        //check if age IS NOT more than 7. print "Need to sit in child car seat. age

        if (!(age > 7)) {
            System.out.println("Need to sit in child car seat. age = " + age);
        } else {
            System.out.println("Can sit normal seat. age = " + age);
        }

        boolean isSmokingAllowed = false;
        if (!isSmokingAllowed){
            System.out.println("Smoking is not allowed here. Exit1");
        } else {
            System.out.println("Smoking area");
        }

        boolean isAffordable = true;
        if (!isAffordable){
            System.out.println("Item is affordable");
        } else {
            System.out.println("Item is not affordable");
        }

        String carModel = "tesla";
        if (!carModel.equals("tesla")){
            System.out.println("Not interested");
        } else {
            System.out.println(" it okay");
        }

        String secretPassword = "abc123";
        String inputPassword = "abc123";
        if(!inputPassword.equals(secretPassword)){   // better one to use because it is String   .equals
            System.out.println("Incorrect Password");}
        // if (inputPassword != secretPassword){
           // System.out.println("Incorrect password"); }
         else {
            System.out.println("Correct password");
        }


    }
}
