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
    // x,y为我的坐标
    static int x = 1;
    static int y = 1;
    // 图个方便
    static String wall = "墙";
    static String me = "我";
    static String box = "箱";
    static String target = "目";
    static String blank = "　";

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

        //初始化map
        for (int i = 0; i < map.length; i++) {
            Arrays.fill(map[i], blank);
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
        map[x][y] = me;
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
        switch (input) {
            case "W":
            case "w":
                if (map[x - 1][y].equals(blank)) {
                    //交换我和空气
                    map[x][y] = blank;
                    x--;
                    map[x][y] = me;
                    break;
                }
                if (map[x - 1][y].equals(box)) {
                    //判断箱子将移动的位置是不是目标
                    if (map[x - 2][y].equals(target)) {
                        gameover();
                        break;
                    }
                    //判断箱子将移动的位置是不是空气
                    if (map[x - 2][y].equals(blank)) {
                        //交换箱子和空气
                        String temp = map[x - 1][y];
                        map[x - 1][y] = map[x - 2][y];
                        map[x - 2][y] = temp;
                        //交换我和空气
                        map[x][y] = blank;
                        x--;
                        map[x][y] = me;
                        break;
                    }
                }
            case "A":
            case "a":
                if (map[x][y - 1].equals(blank)) {
                    //交换我和空气
                    map[x][y] = blank;
                    y--;
                    map[x][y] = me;
                    break;
                }
                if (map[x][y - 1].equals(box)) {
                    //判断箱子将移动的位置是不是目标
                    if (map[x][y - 2].equals(target)) {
                        gameover();
                        break;
                    }
                    //判断箱子将移动的位置是不是空气
                    if (map[x][y - 2].equals(blank)) {
                        //交换箱子和空气
                        String temp = map[x][y - 1];
                        map[x][y - 1] = map[x][y - 2];
                        map[x][y - 2] = temp;
                        //交换我和空气
                        map[x][y] = blank;
                        y--;
                        map[x][y] = me;
                        break;
                    }

                }
            case "S":
            case "s":
                if (map[x + 1][y].equals(blank)) {
                    //交换我和空气
                    map[x][y] = blank;
                    x++;
                    map[x][y] = me;
                    break;
                }
                if (map[x + 1][y].equals(box)) {
                    //判断箱子将移动的位置是不是目标
                    if (map[x + 2][y].equals(target)) {
                        gameover();
                        break;
                    }
                    //判断箱子将移动的位置是不是空气
                    if (map[x + 2][y].equals(blank)) {
                        //交换箱子和空气
                        String temp = map[x + 1][y];
                        map[x + 1][y] = map[x + 2][y];
                        map[x + 2][y] = temp;
                        //交换我和空气
                        map[x][y] = blank;
                        x++;
                        map[x][y] = me;
                        break;
                    }
                }
            case "D":
            case "d":
                if (map[x][y + 1].equals(blank)) {
                    //交换我和空气
                    map[x][y] = blank;
                    y++;
                    map[x][y] = me;
                    break;
                }
                if (map[x][y + 1].equals(box)) {
                    //判断箱子将移动的位置是不是目标
                    if (map[x][y + 2].equals(target)) {
                        gameover();
                        break;
                    }
                    //判断箱子将移动的位置是不是空气
                    if (map[x][y + 2].equals(blank)) {
                        //交换箱子和空气
                        String temp = map[x][y + 1];
                        map[x][y + 1] = map[x][y + 2];
                        map[x][y + 2] = temp;
                        //交换我和空气
                        map[x][y] = blank;
                        y++;
                        map[x][y] = me;
                        break;
                    }
                }
            case "exit":
                System.exit(114514);
            default:
                System.out.println("输入有误，请重新输入");
                break;
        }
    }

    private static void gameover() {
        System.out.println("\n\n\n\n\n\n\n\n");
        System.out.println("游戏目标已达成，游戏结束!");
        System.exit(0);
    }
}
