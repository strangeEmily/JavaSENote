/**
 * 包
 * 1. 作用
 *   - 为了解决类的命名冲突问题
 * 2. 定义
 *   - 使用package语句定义
 *   - package语句只能出现在.java源文件的第一行
 *   - package定义的格式：通常采用公司域名的倒叙+项目名+文件路径的方式,例：com.fruitday.platform.web.controller.order
 *   - 完整的类名是带有包名的
 * 3. 编译
 *   - 带有package语句的java源文件的编译方式为： javac -d 生成路径 java源文件路径
 * 4. 导入其他类
 *   - import语句：
 *     - 导入order类 import com.fruitday.platform.web.controller.order
 *     - 导入com.fruitday.platform.web.controller包中的所有类： import com.fruitday.platform.web.controller.*
 *     - java.lang包中的类可以直接引用，不用手动导入
* */
package OO;
public class OOTest20_packageImport {
    public static void main(String[] args){
       System.out.println("Test");
    }
}
