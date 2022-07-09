package train5;

import methods.Array;

import java.util.Arrays;

import java.util.Scanner;

/*
 * 推箱子游戏
 *
 * 流程
 * 生成地图 -> 游戏介绍 -> 游戏操作 -> 通关判定
 * */
public class Complex4 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        String[][] map = mapCreate();
        System.out.println("欢迎游玩本游戏（就是个推箱子游戏）");
        do {
            mapPrint(map);
            System.out.println("WASD对应上左下右移动");
            System.out.println("请输入你的指令：");
            String input = scan.next();
            move(map, input);
        } while (true);
    }

    private static String[][] mapCreate() {
        //新建地图二维数组
        String[][] map = new String[8][10];
        String wall = "墙";
        String me = "我";
        String box = "箱";
        String target = "目";

        //初始化map
        for (int i = 0; i < map.length; i++) {
            Arrays.fill(map[i], "　");
        }
        //填充四周的墙
        for (int i = 0; i < map.length; i++) {
            map[i][0] = wall;
            map[i][9] = wall;
        }
        Arrays.fill(map[0], wall);
        Arrays.fill(map[7], wall);
        //填充里面的墙
        map[1][3] = map[2][3] = map[3][3] = wall;
        map[2][5] = map[3][5] = map[3][6] = wall;
        map[3][8] = map[4][8] = wall;
        map[5][4] = map[5][5] = map[5][6] = map[6][4] = wall;
        //填充关键要素
        map[1][1] = me;
        map[2][2] = box;
        map[6][5] = target;

        return map;
    }

    private static void mapPrint(String[][] map) {
        System.out.println("------------------------------");
        Array.printArray(map);
        System.out.println("------------------------------");
    }

    private static void move(String[][] map, String input) {
        //找到”我“的位置
        int[] pos = new int[2];
        String me = "我";
        for (int i = 1; i < map.length - 1; i++) {
            String str = stringArrayToString(map[i]);
            int num = str.indexOf(me);
            if (num >= 0) {
                pos[0] = i;
                pos[1] = num;
                break;
            }
        }


        switch (input) {
            case "W":
            case "w":
                if (map[pos[0] - 1][pos[1]].equals("　")) {
                    //交换我和空气
                    String temp = map[pos[0]][pos[1]];
                    map[pos[0]][pos[1]] = map[pos[0] - 1][pos[1]];
                    map[pos[0] - 1][pos[1]] = temp;
                }
                if (map[pos[0] - 1][pos[1]].equals("箱")) {
                    //判断箱子将移动的位置是不是空气
                    if (map[pos[0] - 2][pos[1]].equals("　")) {
                        //交换箱子和空气
                        String temp = map[pos[0] - 1][pos[1]];
                        map[pos[0] - 1][pos[1]] = map[pos[0] - 2][pos[1]];
                        map[pos[0] - 2][pos[1]] = temp;
                        //交换我和空气
                        temp = map[pos[0]][pos[1]];
                        map[pos[0]][pos[1]] = map[pos[0] - 1][pos[1]];
                        map[pos[0] - 1][pos[1]] = temp;
                    }
                    //判断箱子将移动的位置是不是目标
                    if (map[pos[0] - 2][pos[1]].equals("目")) {
                        gameover();
                        break;
                    }
                }
                break;
            case "A":
            case "a":
                if (map[pos[0]][pos[1] - 1].equals("　")) {
                    //交换我和空气
                    String temp = map[pos[0]][pos[1]];
                    map[pos[0]][pos[1]] = map[pos[0]][pos[1] - 1];
                    map[pos[0]][pos[1] - 1] = temp;
                }
                if (map[pos[0]][pos[1] - 1].equals("箱")) {
                    //判断箱子将移动的位置是不是空气
                    if (map[pos[0]][pos[1] - 2].equals("　")) {
                        //交换箱子和空气
                        String temp = map[pos[0]][pos[1] - 1];
                        map[pos[0]][pos[1] - 1] = map[pos[0]][pos[1] - 2];
                        map[pos[0]][pos[1] - 2] = temp;
                        //交换我和空气
                        temp = map[pos[0]][pos[1]];
                        map[pos[0]][pos[1]] = map[pos[0]][pos[1] - 1];
                        map[pos[0]][pos[1] - 1] = temp;
                    }
                    //判断箱子将移动的位置是不是目标
                    if (map[pos[0]][pos[1] - 2].equals("目")) {
                        gameover();
                        break;
                    }
                }
                break;
            case "S":
            case "s":
                if (map[pos[0] + 1][pos[1]].equals("　")) {
                    //交换我和空气
                    String temp = map[pos[0]][pos[1]];
                    map[pos[0]][pos[1]] = map[pos[0] + 1][pos[1]];
                    map[pos[0] + 1][pos[1]] = temp;
                }
                if (map[pos[0] + 1][pos[1]].equals("箱")) {
                    //判断箱子将移动的位置是不是空气
                    if (map[pos[0] + 2][pos[1]].equals("　")) {
                        //交换箱子和空气
                        String temp = map[pos[0] + 1][pos[1]];
                        map[pos[0] + 1][pos[1]] = map[pos[0] + 2][pos[1]];
                        map[pos[0] + 2][pos[1]] = temp;
                        //交换我和空气
                        temp = map[pos[0]][pos[1]];
                        map[pos[0]][pos[1]] = map[pos[0] + 1][pos[1]];
                        map[pos[0] + 1][pos[1]] = temp;
                    }
                    //判断箱子将移动的位置是不是目标
                    if (map[pos[0] + 2][pos[1]].equals("目")) {
                        gameover();
                        break;
                    }
                }
                break;
            case "D":
            case "d":
                if (map[pos[0]][pos[1] + 1].equals("　")) {
                    //交换我和空气
                    String temp = map[pos[0]][pos[1]];
                    map[pos[0]][pos[1]] = map[pos[0]][pos[1] + 1];
                    map[pos[0]][pos[1] + 1] = temp;
                }
                if (map[pos[0]][pos[1] + 1].equals("箱")) {
                    //判断箱子将移动的位置是不是空气
                    if (map[pos[0]][pos[1] + 2].equals("　")) {
                        //交换箱子和空气
                        String temp = map[pos[0]][pos[1] + 1];
                        map[pos[0]][pos[1] + 1] = map[pos[0]][pos[1] + 2];
                        map[pos[0]][pos[1] + 2] = temp;
                        //交换我和空气
                        temp = map[pos[0]][pos[1]];
                        map[pos[0]][pos[1]] = map[pos[0]][pos[1] + 1];
                        map[pos[0]][pos[1] + 1] = temp;
                    }
                    //判断箱子将移动的位置是不是目标
                    if (map[pos[0]][pos[1] + 2].equals("目")) {
                        gameover();
                        break;
                    }
                }
                break;
            case "exit":
                System.exit(114514);
            default:
                System.out.println("输入有误，请重新输入");
                break;
        }
    }

    public static String stringArrayToString(String[] arr) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            builder.append(arr[i]);
        }
        return builder.toString();
    }

    private static void gameover() {
        System.out.println("\n\n\n\n\n\n\n\n");
        System.out.println("游戏目标已达成，游戏结束!");
        System.exit(0);
    }
}
