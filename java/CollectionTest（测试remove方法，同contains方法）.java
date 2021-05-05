import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

/**
 * @author 潘俊杰
 * @date 2021年05月05日 14:53
 */
public class CollectionTest {
    public static void main(String[] args) {
        //创建一个ArrayList集合
        Collection c = new ArrayList();
        //添加两个同为 hello 的对方进集合
        c.add(new String("hello"));
        c.add(new String("hello"));

        //调用iterator方法，拿出迭代器Iterator
        Iterator it = c.iterator();

        //遍历集合元素
        while(it.hasNext()){
            System.out.println(it.next());
        }
        //删除hello元素
        c.remove("hello");
        //打印输出集合元素个数
        System.out.println(c.size());   //两个元素删除一个还剩一个，打印输出1

        //创建一个s1，内容也为hello，但是不添加进集合
        String s1 = new String("hello");

        //删除s1，因为equals被重写，删除同为hello的元素，所以集合中的元素被删除
        c.remove(s1);               //需要重写equals方法，remove调用equals方法，重写后直接判断内容，不判断地址。

        System.out.println(c.size()); // hello被删除，现在集合中没有元素
    }

    /**
     * 重写equals方法和hashcode方法
     */
    public  class User{
        String name;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            User user = (User) o;
            return Objects.equals(name, user.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }
}
