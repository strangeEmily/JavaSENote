package OO;

import OO.OOTest09_Inherit;

/**
 * 继承
 * 1.作用
 * - 引入类的继承的最基本的作用是：代码重用
 * - 继承是重写和多态的前提
 * 2.语法:
 *     [修饰符列表] class 子类名 extends 父类名{}
 * 3.规则：
 *     3.1 只支持单继承，即一个类只能直接继承一个父类
 *     3.2 若一个类没有显式的继承其他类则该类默认继承java中的根类object
 *     3.3 子类会继承父类中除过构造方法之外的所有属性和方法，但是私有的属性无法直接访问需要通过get/set方法访问
 * */
public class OOTest10_Inherit_Son extends OOTest09_Inherit {
    public static void main(String[] args){

        OOTest09_Inherit inherit = new OOTest09_Inherit();

        String s = "继承是为了代码重用";
        inherit.print(s);
        // 私有属性只能通过get/set方法间接访问
        inherit.print(inherit.getName());
    }
}
