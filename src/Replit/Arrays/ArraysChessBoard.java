package Replit.Arrays;
import java.util.*;
/*
Given a 8x8 two-dimensional array of strings named chessboard. Initialize values inside an array accordingly
to the chess board. So first element in the array, chessboard[0] should have a value "1a",
and last element in the array, chessboard[7] should have a value "8h".
 */
public class ArraysChessBoard {
    public static void main(String[] args) {
        String[][] chessBoard = new String[8][8];
        char chessLetter;
        for(int i = 1 ;i <= 8;i++){
            chessLetter = 'a';
                for(int j = 1 ; j <= 8; j++)
                {
                    chessBoard[i][j] = i + (chessLetter + "");
                    chessLetter++;
                }//end for cols
            }
        System.out.println(Arrays.deepToString(chessBoard));
        }

    }

