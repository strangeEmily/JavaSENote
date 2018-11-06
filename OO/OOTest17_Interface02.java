package OO;

/**
 * 接口的作用
 * 1. 使项目分层，所有层都面向接口开发，方便协作，可以提高开发效率
 * 2. 接口使代码之间的耦合度降低，变得可插拔可随意切换，就像灯泡和灯口之间的关系
 * 注意
 * - 若一个功能用抽象类和接口都能实现的话优先使用接口，因为接口可以多实现多继承，而且一个类再实现了接口之后还可以再继承其他类
 * */
public class OOTest17_Interface02 {
    /**
     * 以客户退出系统的功能为例：
     * main方法调用面对的是CustomerService这个接口，logout方法实现实现的是CustomerService接口，两方面的功能都
     * 面向接口，各自之间相互独立
    * */
    public static void main(String[] args){
        // 为CustomerService这个类创建一个子类型对象CustomerServiceImpl【多态】
        CustomerService customerService = new CustomerServiceImpl();
        customerService.logout();
    }
}

// 接口
interface CustomerService{
    // 定义一个退出系统的抽象方法
    void logout();
}
// 实现类
class CustomerServiceImpl implements CustomerService{

    // 实现接口中的抽象方法
    public void logout(){
        System.out.println("您已退出系统！");
    }

}




