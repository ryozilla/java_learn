package train.t10;

import java.util.ArrayList;

/*
 * 找到名宇最后一个字相同的人
 * 在“张三”“李四”“王五”“赵六”“周七”“王哲”“白浩”“贾蓉”“慕容阿三”“黄蓉”10个名字中找到并输出最后一个字相同的名字。
 * */
public class Complex4 {
    public static void main(String[] args) {
        String[] names = new String[]{"张三", "李四", "王五", "赵六", "周七", "王哲", "白浩", "贾蓉", "慕容阿三", "黄蓉",};

        //找到最后一个字可能是哪些字
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < names.length; i++) {
            //获取名字最后一个字
            String lastStr = Character.toString(names[i].charAt(names[i].length() - 1));
            if (!list.contains(lastStr)) {
                //如果不在集合里就加入集合
                list.add(lastStr);
            }
        }

        //找到最后一个字重复的几个名字
        for (String lastStr : list) {
            ArrayList<String> name = new ArrayList<>();
            for (String str : names) {
                if (Character.toString(str.charAt(str.length() - 1)).equals(lastStr)) {
                    name.add(str);
                }
            }
            if (name.size() > 1) {
                System.out.println("最后一个字都是\"" + lastStr + "\"的名字：" + name);
            }
        }
    }
}
