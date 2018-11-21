package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Collections工具类
 *
 * sort()方法可对指定列表排序
 * */
public class CLTest07_Collections{
    public static void main(String[] args){
        List l = new ArrayList();

        l.add(32);
        l.add(21);
        l.add(13);
        l.add(54);

        Collections.sort(l);

        Iterator it = l.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
