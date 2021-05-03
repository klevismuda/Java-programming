package Day30_arrays;

import java.util.Locale;

public class StudentArray {
    public static void main(String[] args) {

        String[] student1 = {"1234", "Klevis", "Muda", "batch22", "+1940993"};
        System.out.println("ID Number   : " + student1[0]);
        System.out.println("First Name  : " + student1[1]);
        System.out.println("Last Name   : " + student1[2]);
        System.out.println("Batch Num   : " + student1[3]);
        System.out.println("Phone Number: " + student1[4]);

        System.out.println("First and Last Name  : " + student1[1].toUpperCase() + " " + student1[2].toUpperCase());


        /** check if student1 data array contains 5 items.
         * true: PASS: data array has correct length
         * false: FAIL: data array has incorrect length
         */
        if (student1.length == 5) {
            System.out.println("PASS: data array has correct length");
        } else {
            System.out.println(" FAIL: data array has incorrect length");
        }
        System.out.println("Student data length " + student1.length);

        System.out.println("=====================================");

        String[] student2 = new String[5];
        student2[0] = "1234";
        student2[1] = "Adam";
        student2[2] = "Smith";
        student2[3] = "B22";
        student2[4] = "202 - 543 - 1234";

        System.out.println("student id = " + student2[0]);
        System.out.println("student1 firstName = " + student2[1]);
        System.out.println("student1 lastName = " + student2[2]);
        System.out.println("student1 batch Num = " + student2[3]);
        System.out.println("student1 mobile num = " + student2[4]);


        /**
         * Check if student1 and student2 array have the same number of data
         * TRUE: PASS: data arrays length match
         * FALSE: FAIL: data arrays length mismatch
         */
        if (student1.length == student2.length) {
            System.out.println("PASS: data arrays length match.");
        } else {
            System.out.println("FAIL: data arrays length mismatch");
        }

        String mobileNum = student1[4];
        System.out.println(mobileNum);

    }
}
