package train.t7;

/*
 * 总统是不是公务员？
 * 通过 instanceof 判断总统是不是公务员，并输出公务员和总统的主要工作。
 *
 * ↑ 认为总统属于公务员
 * */
public class Training8 {
    public static void main(String[] args) {
        President president = new President();
        if (president instanceof PublicServant) {   //看着这个冒黄我都不知道我和答案写这个有什么意义o(￣┰￣*)ゞ
            president.work();
        }
    }
}

class PublicServant {
    protected void work() {
        System.out.println("公务员处理日常事务");
    }
}

class President extends PublicServant {
    protected void work() {
        super.work();
        System.out.println("总统掌控方针、政策和方向，处理国内乃至国与国之间的事务");
    }
}