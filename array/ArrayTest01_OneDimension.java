package array;
/**
 * 数组
 * 1.解释
 *   1.1 数组是一种引用数据类型
 *   1.2 数组是一种简单的数据结构，属于线性结构
 *   1.3 数组是一个容器，用来存储其他元素，数组可以存储任意类型的元素
 *   1.4 数组的类别：一维数组，二维数组，三维数组，多维数组
 *   1.5 数组中存储的元素数据类型是统一的
 *   1.6 数组对象的内存地址为数组首元素的内存地址
 *   1.7 数组有length属性
 *   1.8 数组的长度是固定的，且不可修改
 *2.访问
 *   - 数组中的每个元素都是有下标的，可以通过下标访问元素【下标从0开始记】
 *3.初始化
 *  3.1 静态初始化  eg: String s02[] = {"x","y","z"};
 *  3.2 动态初始化
 *      - 动态初始化一维数组，会先在堆内存中分配这个数组，并且数组中每个元素都采用默认值
 *      - eg: int[] i02 = new int[4];
 *      - 使用场景：创建数组时无法预测数组中存储的数据，只是先开辟出内存空间
* */

/*以下示例均已一维数组为例*/
public class ArrayTest01_OneDimension {
    public static void main(String[] args){
        //数组声明 - 元素为基本数据类型
        int i01[] = {1,2,3,4};
        String s[] = {"a","b","c","d"};
        boolean b[] = {true,false,false,true};

        //数组声明 - 元素为引用数据类型
        Object o1 = new Object();
        Object o2 = new Object();
        Object o3 = new Object();
        /*
        o[]中存储的o1,o2,o3这三个对象的内存地址
        * */
        Object o[] ={o1,o2,o3};
        //数组具有length属性
        System.out.println(o.length);

        //通过下标访问数组
        //访问数组中的第一个元素
        System.out.println(s[0]);
        //访问数组中的最后一个元素
        System.out.println(b[b.length -1]);

         //数组初始化
         //静态初始化
         String s02[] = {"x","y","z"};
         //动态初始化
         int[] i02 = new int[4];
         //数组遍历
        for (int i=0;i<i02.length;i++){
            System.out.println(i02[i]);
        }
        for (int i=0;i<s02.length;i++){
            System.out.println(s02[i]);
        }

        /**
         * test： 动态创建一个包含不同对象Dog和Cat的数组并进行遍历
         * */
        // 创建包含不同类型的数组只需创建一个他们的父类型的数组
        Animal animal[] = new Animal[4];
        // 为数组赋值
        Cat c1 = new Cat();
        Cat c2 = new Cat();
        Dog d1 = new Dog();
        Dog d2 = new Dog();

        animal[0] = c1;
        animal[1] = c2;
        animal[2] = d1;
        animal[3] = d2;

        // 遍历时可将元素强制转换为子类型，并调用子类型的方法
        for (int i = 0; i< animal.length; i++){
            //instanceof判断对象是否是这个特定类或者是它的子类的一个实例
            Animal a = animal[i];
            if (a instanceof Cat){
               Cat c = (Cat)a;
               c.move();
            }else if (a instanceof Dog){
               Dog d = (Dog)a;
               d.eat();
            }
        }

    }
}

class Animal{

        }
class Dog extends Animal{
    public void eat(){
        System.out.println("狗在吃东西！");
    }
}

class Cat extends Animal{
    public void move(){
        System.out.println("猫在屋顶走来走去");
    }
}
