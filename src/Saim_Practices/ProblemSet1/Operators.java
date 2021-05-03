package Saim_Practices.ProblemSet1;
/*
Analyze each step, What is the result of a, b, and c?
int a = 3, b = 2;
long c = (a-- + b) * 2 / 3 % 2;
 */
public class Operators {
    public static void main(String[] args) {
        int a = 3, b = 2; //2 2
        long c = (a-- + b) * 2 / 3 % 2;
        //    (3 + 2) * 2 / 3 % 2;
        //   10 / 3 % 2 = 3%2 = 1
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
   /*
   Analyze each step, What is the result numOne, numTwo, and biggest?
int numOne = 10;
int numTwo = numOne++ * 3 + ++numOne + numOne++ % 2;
int biggest = numOne > numTwo ? numOne : numTwo;

    */
        int numOne = 10;  // 11, 13
        int numTwo = numOne++ * 3 + ++numOne + numOne++ % 2;
                    // 10      *3       12          12  = 30 + 12 + 0 = 42
        int biggest = numOne > numTwo ? numOne : numTwo;
                       // 13 > 42  --> 42
        System.out.println(numOne);
        System.out.println(numTwo);
        System.out.println(biggest);

    }

}