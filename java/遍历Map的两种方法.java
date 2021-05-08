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
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
        map.put(4, "d");

        //第一种方式
        //获取所有的key，所有的keys是一个set集合
        Set<Integer> keys = map.keySet();
        //set集合调用iterator，拿到构造器
        Iterator<Integer> it = keys.iterator();
        
        //遍历key 就可有拿到每一个key对应的value
        while (it.hasNext()){
            Integer key =it.next();
            
            //map调用get(key)方法，拿到key对应的value
            String value = map.get(key);
            
            System.out.println(key +" : " + value);
        }

        System.out.println("===========================");

        //用foreach也可以，返回变量为 key
        for (Integer key : keys) {
            System.out.println(key + " : " + map.get(key));
        }

        System.out.println("===================================");

        //第二种方式 Set<Map.Entry<K, V>>  entrySet()
        //以上这个集合是把map集合全部转换成set集合
        //Set集合中的类型是 Map.entry
        //构造器遍历
        Set<Map.Entry<Integer, String>> set = map.entrySet();
        Iterator<Map.Entry<Integer, String>> it2 = set.iterator();
        while (it2.hasNext()){
            //node 里面包含了key 和 value
            //类型为 Map.Entry<Integer, String>
             Map.Entry<Integer, String> node = it2.next();
             Integer key = node.getKey();
             String value = node.getValue();
             System.out.println(key + " : " + value);
        }

        System.out.println("============================");
        //foreach 遍历
        for (Map.Entry<Integer, String> integerStringEntry : set) {
            System.out.println(integerStringEntry.getKey() + ":" + integerStringEntry.getValue());
        }
    }

}
