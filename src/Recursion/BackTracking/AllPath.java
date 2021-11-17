package Recursion.BackTracking;

import java.util.Arrays;

public class AllPath {
    public static void main(String[] args) {
        boolean[][] board = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };
//        allPath(board, 0, 0, "");
        int[][] path = new int[board.length][board[0].length];
        allPathPrint(board,0,0,"",path,1);
    }

    //    Stackoverflow
    static void allPath(boolean[][] maze, int row, int col, String p) {
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            System.out.println(p);
            return;
        }
        if (!maze[row][col]) {
            return;
        }
//        path
        maze[row][col] = false;
        if (row < maze.length - 1) {

            allPath(maze, row + 1, col, p + "D");

        }
        if (col < maze[0].length - 1) {

            allPath(maze, row, col + 1, p + "R");

        }
        if (row > 0) {

            allPath(maze, row - 1, col, p + "U");

        }
        if (col > 0) {

            allPath(maze, row, col - 1, p + "L");

        }
//        this line is where the function will be over
//        so before the function get removed, also remove the changes were made by that function
        maze[row][col] = true;
    }
    static void allPathPrint(boolean[][] maze, int row, int col,String p, int[][] path,int step) {
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            path[row][col] =step;
            for (int[] arr : path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if (!maze[row][col]) {
            return;
        }
//        path
        maze[row][col] = false;
        path[row][col] =step;
        if (row < maze.length - 1) {

            allPathPrint(maze, row + 1, col, p + "D",path,step+1);

        }
        if (col < maze[0].length - 1) {

            allPathPrint(maze, row, col + 1, p + "R",path,step+1);

        }
        if (row > 0) {

            allPathPrint(maze, row - 1, col, p + "U",path,step+1);

        }
        if (col > 0) {

            allPathPrint(maze, row, col - 1, p + "L",path,step+1);

        }
//        this line is where the function will be over
//        so before the function get removed, also remove the changes were made by that function
        maze[row][col] = true;
        path[row][col] =0;

    }
}
