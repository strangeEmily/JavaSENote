package OO;

/**
 * 方法重写
 * 1. 什么时候需要方法重写
 * - 父类中的方法无法满足业务需求时
 * 2. 重写后的调用
 * - 若某个类重写了父类的方法，则子类对象调用的是重写后的方法
 * 3. 方法重写的条件
 * - 3.1 重写发生在具有继承关系的两个类之间
 * - 3.2 必须具有相同的方法名，返回值和参数列表
 * - 3.3 重写的方法不能比被重写的方法访问权限更低
 * - 3.4 重写的方法不能比被重写的方法抛出的异常更宽泛
 * - 3.5 私有方法无法重写
 * - 3.6 构造方法无法重写，因为构造方法不能被继承
 * - 3.7 静态方法不能重写
 * - 3.8 重写只针对成员方法，和成员变量无关
 */
class OOTest11_Override extends OOTest09_Inherit {
    public static void main(String[] args) {
        OOTest11_Override override = new OOTest11_Override();
        String s = "Test";
        try {
            override.print(s);
        } catch (Exception e) {

        }

    }

    //    public void print(String s) throws Exception{
    public void print(String s) {
        System.out.println("方法重写:" + s);
    }
}
