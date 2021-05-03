package Replit.Arrays;
/*
The highest and lowest scores are thrown out, and the remaining scores are added together.
The sum is then multiplied by the degree of difficulty for that dive.
The degree of difficulty ranges from 1.2 to 3.8 points.
The total is then multiplied by 0.6 to determine the divers score.

Flow:
Accept the 7 scores from the judges
Accept the difficulty number
Display the final score
Enter score for judge 1:
1
Enter score for judge 2:
5
Enter score for judge 3:
5
Enter score for judge 4:
5
Enter score for judge 5:
5
Enter score for judge 6:
8
Enter score for judge 7:
9
Enter difficulty:
2.1
Total: 35.28
 */
import java.util.*;
public class Diving {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float[] score = new float[7];
        float sum = 0;
        for(int i = 0; i < 7; i++){
            System.out.println("Enter score for judge " + (i+1) + ":");
            score [i] = input.nextFloat();

        }
        Arrays.sort(score);
        for(int i = 1; i < score.length - 1; i++)
            sum += score[i];

        System.out.println("Enter difficulty:");
        float difficulty = input.nextFloat();
        float result = sum * difficulty * (float)(0.6);
        System.out.println(result);
    }
}

/*  Another slution
System.out.println("Enter difficulty: ");
        float difficulty = input.nextFloat();

        float max = score[0];
        float min = score[0];
        float sum = 0;
        for(int i = 0;i < score.length;i++){
            if(score[i] > max){
                max = score[i];
            }
            if(score[i] < min){
                min = score[i];
            }
        }
        for(int i = 0;i < score.length;i++){
            if(score[i] == max || score[i] == min){
                continue;
            }else{
                sum += score[i];
            }
        }
        float result = sum * difficulty * (float)(0.6);
        System.out.println(result);
 */
