package Day08_casting_scanner;

public class CastingExamples {
    public static void main(String[] args) {
        //byte - short - int - long
        byte num1 = 100;
        short num2 = num1;
        int num3 = num1;
        int num4 = 1000;
        long num5 = num4;
        //float - double
        float num6 = 124.4F;
        double num7 = num6;

        int num8 = 3456;
        double num9 = num8;
        System.out.println(num8); //3456
        System.out.println("num9 = " + num9); //3456.0

        System.out.println("=======================");

        int num10 = 22;
        byte num11 = (byte)num10;
        short num12 = (short)num10;//cast/convert to smaller short
        System.out.println("num10 = " + num10);
        System.out.println("num11 = " + num11);
        System.out.println("num12 = " + num12);

        double num13 = 55.3;
        float num14 = (float)num13;
        System.out.println("num13 = " + num13);
        System.out.println("num14 = " + num14);

        double num15 = 1234.5;
        int num16 = (int)num15;//1234

        System.out.println("num15 = " + num15);//1234.5
        System.out.println("num16 = " + num16);//1234

        int num17 = -5;

        System.out.println("num17 = " + num17++);
        System.out.println(num17 = 0);
        System.out.println(--num17 );

        char letter = 'M';
        int numLetter = letter;
        System.out.println("letter = " + letter);
        System.out.println("numLetter = " + numLetter); //77

        long l = 100;
        short s = (short) l ;
        System.out.println(s+10);

        int check = 132;
        String str = "";

        if(check % 2 ==0) {
            str += check;
            if (check % 5 == 0) {
                str += "132";
            } else {
                str = "500";

            }
        }
            else {
                str +="132";
            }
        System.out.println(str);
        }

    }

