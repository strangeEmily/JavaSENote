package OO;

/**
 * 多态
 * 作用：降低代码之间的耦合度，提高项目的扩展能力
 *
* */

/*模拟一个主人喂猫和狗吃东西的功能说明多态的作用*/
public class OOTest12_Pleomorphic {
    public static void main(String args[]){
        // 创建一个对象 - 主人
        Person p = new Person();
        // 创建一个对象 - 狗
        Dog d = new Dog();
        // 创建一个对象 - 猫
        Cat c = new Cat();

        // 执行喂养方法
        // --- 01. 不使用多态【每新增一个宠物类型就需要新增feed方法】
        p.feed(d);
        p.feed(c);
        // ---02. 使用多态【新增宠物只需让新宠物的class继承Pet即可】
        // 因为java中可以为父类型的变量直接new一个子类型对象，因此可以直接将d和c作为feedPet方法的入参
        // 又因为Dog和Cat这两个子类都对父类中的eat方法进行了重写，所以程序执行时执行子类中的eat方法
        p.feedPet(d);
        p.feedPet(c);

    }
}

class Person{
    public void feed(Dog dog){
        dog.eat();
    }

    public void feed(Cat cat){
        cat.eat();
     }

     public void feedPet(Pet pet){
        pet.eat();
     }
}

class Dog extends Pet{
    public void eat() {
        System.out.println("狗啃骨头");
    }
}

class Cat extends Pet{
    public void eat(){
        System.out.println("猫吃鱼");
    }
}

class Pet{
    public void eat(){

    }
}




