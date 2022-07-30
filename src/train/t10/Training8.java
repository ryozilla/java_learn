package train.t10;

/*
 * 模拟员工打卡公司
 * 有“张三”“李四”“王五”“赵六”“周七”“王哲”“白浩”“贾蓉”“慕容阿三”“黄蓉”10名员工，
 * 请模拟员工打卡：
 * 员工输入自己的名字，如果名单中有该员工，则提示“签到成功”，否则提示员工不存在。
 * */
public class Training8 {
    public static void main(String[] args) {
        isEmployee("张三");
        isEmployee("张四");
    }

    static String[] stuffs = new String[]{"张三", "李四", "王五", "赵六", "周七", "王哲", "白浩", "贾蓉", "慕容阿三", "黄蓉",};

    public static boolean isEmployee(String stuff) {
        for (int i = 0; i < stuffs.length; i++) {
            if (stuff.equals(stuffs[i])) {
                System.out.println("是员工");
                return true;
            }
        }

        System.out.println("不是员工");
        return false;
    }
}
