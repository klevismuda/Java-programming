package Day17_ternary_nested_conditions;

public class AmazonPrimeShopping {
    public static void main(String[] args) {
        double itemPrice = 30;
        boolean isPrimeMember = true;
        String shipping = (isPrimeMember == true) ? "Eligible for free 2 day shipping" : (itemPrice > 25) ?
                            "Eligible for free regular shipping" : "Not eligible for free shipping. fee is $10";
        System.out.println(shipping);
    }
}
