package train.t12;

import java.util.*;

/*
 * 输出NBA历史十大明星
 * 输出NBA历史十大明星的"绰号""场均得分""场均篮板""场均助攻"
 * */
public class Training1 {

    static class NBAStars {
        String name;
        String nickname;    //绰号
        double score;       //场均得分
        double backboard;   //场均篮板
        double assist;      //场均助攻

        public NBAStars(String name, String nickname, double score, double backboard, double assist) {
            this.name = name;
            this.nickname = nickname;
            this.score = score;
            this.backboard = backboard;
            this.assist = assist;
        }

        public String getName() {
            return name;
        }

        public String getNickname() {
            return nickname;
        }

        public double getScore() {
            return score;
        }

        public double getBackboard() {
            return backboard;
        }

        public double getAssist() {
            return assist;
        }
    }

    protected static void printNBAStars(List<NBAStars> stars){
        System.out.println("NBA历史十大明星");
        //System.out.println("名字\t\t绰号\t\t场均得分\t\t场均篮板\t\t场均助攻");
        System.out.printf("%-10s","名字");
        System.out.printf("%-10s","绰号");
        System.out.printf("%-10s","场均得分");
        System.out.printf("%-10s","场均篮板");
        System.out.printf("%-10s%n","场均助攻");
        System.out.println("----------------------------------------------------------");
        for (NBAStars star:stars){
            System.out.printf("%-10s",star.getName());
            System.out.printf("%-10s",star.getNickname());
            System.out.printf("%-10s",star.getScore());
            System.out.printf("%-10s",star.getBackboard());
            System.out.printf("%-10s%n",star.getAssist());
        }
    }

    public static void main(String[] args) {
        ArrayList<NBAStars> stars = new ArrayList<>();

        stars.add(new NBAStars("乔丹","飞人/神",30.1,6.2,5.3));
        stars.add(new NBAStars("拉塞尔","指环王",15.1,22.5,4.3));
        stars.add(new NBAStars("贾巴尔","天钩",24.6,11.2,3.6));
        stars.add(new NBAStars("张伯伦","篮球皇帝",30.1,22.9,4.4));
        stars.add(new NBAStars("约翰逊","魔术师",19.5,7.2,11.2));
        stars.add(new NBAStars("伯德","大鸟",24.3,10.0,6.3));
        stars.add(new NBAStars("邓肯","石佛",20.7,11.4,3.2));
        stars.add(new NBAStars("科比","黑曼巴",25.1,5.3,4.7));
        stars.add(new NBAStars("奥尼尔","大鲨鱼",23.7,10.9,2.5));
        stars.add(new NBAStars("奥拉朱旺","大梦",21.8,11.1,2.5));

        printNBAStars(stars);
    }
}
