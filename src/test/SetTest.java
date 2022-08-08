package test;

import mytry.MethodsTry;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
    public static void main(String[] args) {
        //Set对象和数学集合类似，不以特定顺序排列，不能有重复元素。
        //Set对象也实现了Collection接口
        //Set也是抽象类，需要通过子类(HashSet和TreeSet)获取对象。
        Set<Object> set = new HashSet<>();
        set.add(1);
        set.add(114.514);
        set.add(114.514);   //虽然可以重复写，但储存在对象中的只有一个
        set.add(new Object());

        for (Object obj : set) {
            //遍历set对象时不会按照添加顺序遍历
            System.out.println(obj);
        }

        MethodsTry.line();

        TreeSet<String> treeSet = new TreeSet<>();
        //TreeSet对象只能存放同一类型元素，add不同类型的元素会抛出ClassCastException异常
        treeSet.add("1");
        treeSet.add("1919810");
        treeSet.add("114514");
        treeSet.add("床前明月光");
        treeSet.add("老师看着我睡觉");
        treeSet.add("aiueo");

        for (Object obj : treeSet) {
            //TreeSet集合在遍历时会按照自然顺序递增排列
            System.out.println(obj);
        }
    }
}
