package test;

import java.util.*;

public class ListTest {
    public static void main(String[] args) {
        //List两个子类: ArrayList、LinkedList
        //List类是抽象类，需要依靠子类获取对象
        List<Object> list1 = new ArrayList<>();
        //List实现了Collection接口，可以使用接口中的所有方法
        list1.add(1);
        list1.add("233");
        list1.add(new Object());
        System.out.println(list1);
        //ArrayList的索引和Array一样从0开始
        list1.remove(2);
        System.out.println(list1);
        System.out.println(list1.isEmpty());

        //遍历List
        Iterator<Object> it = list1.iterator();
        System.out.print("[");
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println("]");

        //也可以使用foreach遍历List，写法更轻便
        System.out.print("[");
        for (Object obj : list1) {
            System.out.print(obj + " ");
        }
        System.out.println("]");

        System.out.println(list1.size());
        //清除List中元素
        list1.clear();
        System.out.println(list1.isEmpty());
    }
}
