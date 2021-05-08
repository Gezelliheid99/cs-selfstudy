import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author 潘俊杰
 * @date 2021年05月08日 19:37
 */
public class HashMapTest {
    public static void main(String[] args) {
        Map<Integer, String> hm = new HashMap<>();
        hm.put(1, "a");
        hm.put(2, "b");
        hm.put(3, "c");
        hm.put(4, "d");

        //第一种方式：构造器遍历
        //获取所有的key，所有的keys是一个set集合
        Set<Integer> keys = hm.keySet();
        //set集合调用iterator，拿到构造器
        Iterator<Integer> it = keys.iterator();

        while (it.hasNext()){
            Integer key =it.next();
            //map调用get(key)方法，拿到key对应的value
            String value = hm.get(key);
            System.out.println(key +" : " + value);
        }

        System.out.println("===========================");
        
        //用foreach也可以
        for (Integer key : keys) {
            System.out.println(key + " : " + hm.get(key));
        }
    }
}
