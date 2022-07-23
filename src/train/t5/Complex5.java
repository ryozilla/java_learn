package train.t5;

import methods.Array;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

/*
 * 五子棋
 * (跟着答案敲的)
 */
public class Complex5 {
    static Scanner scan = new Scanner(System.in);
    static final String EMPTY = "-";          //空位
    static final String PLAYER1 = "●";        //实心棋
    static final String PLAYER2 = "◯";        //空心棋
    static String[][] board = new String[10][10];
    static int turn = 1;   //用来判断下棋者
    static boolean finish = false;

    public static void main(String[] args) {
        createBoard();

        //开始游戏
        System.out.println("欢迎游玩五子棋\nrow表示行数，line表示列数");

        while (!finish) {
            printBoard();
            //判断此时下棋者以及接收将下棋子的坐标
            if (turn == 1) {
                System.out.println("请" + PLAYER1 + "输入棋子坐标：");
            } else {
                System.out.println("请" + PLAYER2 + "输入棋子坐标：");
            }
            //输入坐标
            System.out.print("row:");
            int row = scan.nextInt();
            System.out.print("line:");
            int line = scan.nextInt();
            //判断坐标数值是否有误
            if (row < 0 || row > 10 || line < 0 || line > 10) {
                System.out.println("**输入坐标有误，请重新输入**");
                continue;
            }
            //进行放置棋子的操作
            if (!Objects.equals(board[row][line], EMPTY)) {
                System.out.println("**输入坐标已有其他棋子，请重新输入**");
                continue;
            } else {
                if (turn == 1) {
                    board[row][line] = PLAYER1;
                } else {
                    board[row][line] = PLAYER2;
                }
            }
            //执行判断命令
            judgeChessman();
            //改变下棋者
            if (!finish) {
                turn *= -1;
            }
        }
        if (turn == 1) {
            System.out.println("最终的胜利者是：" + PLAYER1);
        } else {
            System.out.println("最终的胜利者是：" + PLAYER2);
        }

    }

    protected static void createBoard() {
        //初始化棋盘
        for (String[] strings : board) {
            Arrays.fill(strings, EMPTY);
        }
        //第一行
        for (int i = 0; i < board[0].length; i++) {
            board[0][i] = i + "";
        }
        //第一列
        for (int i = 1; i < board.length; i++) {
            board[i][0] = i + "";
        }

        //调试用
        board[1][2] = board[2][2] = board[3][2] = PLAYER1;
    }

    protected static void printBoard() {
        //打印棋盘
        System.out.println("------------------------------");
        Array.printArray(board);
        System.out.println("------------------------------");
    }

    protected static void judgeChessman() {
        //判断棋局是否已有五颗棋子连成一线
        //row 行
        //line 列
        for (int row = 1; row < board.length; row++) {
            for (int line = 1; line < board[row].length; line++) {
                //跳过空值
                if (board[row][line].equals(EMPTY)) {
                    return;
                }

                String chessman;            //当前要判定的棋子
                if (turn == 1) {
                    chessman = PLAYER1;
                } else {
                    chessman = PLAYER2;
                }

                //判断棋子上侧
                if (row - 4 > 0
                        && board[row][line].equals(chessman)
                        && board[row - 1][line].equals(chessman)
                        && board[row - 2][line].equals(chessman)
                        && board[row - 3][line].equals(chessman)
                        && board[row - 4][line].equals(chessman)) {
                    printBoard();
                    finish = true;
                    return;
                }

                //判断棋子下侧
                if (row + 4 < 10
                        && board[row][line].equals(chessman)
                        && board[row + 1][line].equals(chessman)
                        && board[row + 2][line].equals(chessman)
                        && board[row + 3][line].equals(chessman)
                        && board[row + 4][line].equals(chessman)) {
                    printBoard();
                    finish = true;
                    return;
                }

                //判断棋子左侧
                if (line - 4 > 0
                        && board[row][line].equals(chessman)
                        && board[row][line - 1].equals(chessman)
                        && board[row][line - 2].equals(chessman)
                        && board[row][line - 3].equals(chessman)
                        && board[row][line - 4].equals(chessman)) {
                    printBoard();
                    finish = true;
                    return;
                }

                //判断棋子右侧
                if (line + 4 < 10
                        && board[row][line].equals(chessman)
                        && board[row][line + 1].equals(chessman)
                        && board[row][line + 2].equals(chessman)
                        && board[row][line + 3].equals(chessman)
                        && board[row][line + 4].equals(chessman)) {
                    printBoard();
                    finish = true;
                    return;
                }

                //判断棋子左上方
                if (row - 4 > 0 && line - 4 > 0
                        && board[row][line].equals(chessman)
                        && board[row - 1][line - 1].equals(chessman)
                        && board[row - 2][line - 2].equals(chessman)
                        && board[row - 3][line - 3].equals(chessman)
                        && board[row - 4][line - 4].equals(chessman)) {
                    printBoard();
                    finish = true;
                    return;
                }

                //判断棋子右上方
                if (row - 4 > 0 && line + 4 < 10
                        && board[row][line].equals(chessman)
                        && board[row - 1][line + 1].equals(chessman)
                        && board[row - 2][line + 2].equals(chessman)
                        && board[row - 3][line + 3].equals(chessman)
                        && board[row - 4][line + 4].equals(chessman)) {
                    printBoard();
                    finish = true;
                    return;
                }

                //判断棋子左下方
                if (row + 4 < 10 && line - 4 > 0
                        && board[row][line].equals(chessman)
                        && board[row + 1][line - 1].equals(chessman)
                        && board[row + 2][line - 2].equals(chessman)
                        && board[row + 3][line - 3].equals(chessman)
                        && board[row + 4][line - 4].equals(chessman)) {
                    printBoard();
                    finish = true;
                    return;
                }

                //判断棋子右下方
                if (row + 4 < 10 && line + 4 < 10
                        && board[row][line].equals(chessman)
                        && board[row + 1][line + 1].equals(chessman)
                        && board[row + 2][line + 2].equals(chessman)
                        && board[row + 3][line + 3].equals(chessman)
                        && board[row + 4][line + 4].equals(chessman)) {
                    printBoard();
                    finish = true;
                    return;
                }
            }
        }
    }
}