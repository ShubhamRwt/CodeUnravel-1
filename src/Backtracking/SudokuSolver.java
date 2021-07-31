package Backtracking;

import java.util.Arrays;

public class SudokuSolver {

    public static void main(String[] args) {

        int[][] board = { {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0} };

        sudokuSolver(board,0, 0);
    }

    private static void sudokuSolver(int[][] board, int row, int col) {

        if(row == board.length){
            display(board);
            return;
        }

        if(col == board.length){
            sudokuSolver(board,row+1, 0);
            return;
        }

        if(board[row][col] == 0){

        for (int no = 1; no <=9 ; no++) {
            if (isSafe(board, row, col, no)){

                board[row][col] = no;
                sudokuSolver(board,row,col + 1);
                board[row][col] = 0;
            }
        }
        } else{
            sudokuSolver(board,row,col + 1);
        }
    }

    private static void display(int[][] board) {

        for (int i = 0; i < board.length ; i++) {

            System.out.println(Arrays.toString(board[i]));
        }

        System.out.println();
    }

    private static boolean isSafe(int[][] board, int row, int col, int no) {

        for (int i = 0; i < board.length; i++) {

            if(board[row][i] == no){
                return false;
            }
        }

        for (int i = 0; i < board.length ; i++) {

            if(board[i][col] == no){
                return false;
            }
        }

        int r = row / 3;
        int c = col / 3;

        for (int i = 3*r; i <3*(r+1) ; i++) {
            for (int j = 3*c; j < 3*(c+1) ; j++) {

                if(board[i][j] == no){
                    return false;
                }
            }
        }
        return true;
    }
}

