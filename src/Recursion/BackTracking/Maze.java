package Recursion.BackTracking;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
//        System.out.println(count(3, 3));
//        pathPrint(3, 3, "");
//        System.out.println(pathReturn(3, 3, ""));
//        System.out.println(pathReturnDiagnal(3, 3, ""));
        boolean[][] board={
                {true,true,true},
                {true,false,true},
                {true,true,true}
        };
        pathObsticals(board,0,0,"");

    }

    static int count(int row, int col) {
        if (row == 1 || col == 1) {
            return 1;
        }
        int left = count(row - 1, col);
        int right = count(row, col - 1);
        return left + right;
    }

    static void pathPrint(int row, int col, String p) {
        if (row == 1 && col == 1) {
            System.out.println(p);
            return;
        }
        if (row > 1) {
            pathPrint(row - 1, col, p + "D");
        }
        if (col > 1) {
            pathPrint(row, col - 1, p + "R");
        }
    }

    static ArrayList<String> pathReturn(int row, int col, String p) {
        if (row == 1 && col == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if (row > 1) {
            list.addAll(pathReturn(row - 1, col, p + "D"));
        }
        if (col > 1) {
            list.addAll(pathReturn(row, col - 1, p + "R"));
        }
        return list;
    }

    static ArrayList<String> pathReturnDiagnal(int row, int col, String p) {
        if (row == 1 && col == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if (row > 1) {
            list.addAll(pathReturnDiagnal(row - 1, col, p + "V"));
        }
        if (col > 1) {
            list.addAll(pathReturnDiagnal(row, col - 1, p + "H"));
        }
        if (row > 1 && col > 1) {
            list.addAll(pathReturnDiagnal(row - 1, col - 1, p + "D"));
        }
        return list;
    }

    static void pathObsticals(boolean[][] maze, int row, int col, String p) {
        if (row == maze.length - 1 && col == maze[0].length-1) {
            System.out.println(p);
            return;
        }
        if(!maze[row][col]){
            return;
        }
        if (row < maze.length-1) {
            pathObsticals(maze,row + 1, col, p + "D");
        }
        if (col < maze[0].length-1) {
            pathObsticals(maze,row, col + 1, p + "R");
        }
    }
}
