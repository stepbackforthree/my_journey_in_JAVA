package Advanced.day3;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

/* HashMap初始化时不分配数组空间（为null），添加第一个元素后分配数组空间（默认数组初始容量为16，负载因子为0.75），
   因此threshold设置为12。达到阈值后数组扩容为原来容量的2倍，且元素索引会随机发生改变。
   HashMap在JDK8时有了新变化，底层实现由原来的数组+链表的形式变成了数组+链表+红黑树的形式。当哈希表的某一位置
   储存了多个数据（链表结点达到8个且数组长度大于64）后，链表会转变为二叉树结构以提高性能，否则优先选择继续扩容
   和添加链表节点。
 */

public class HashMapTest {
    @Test
    public void lowLevelImplementationTest() {
        HashMap hashMap = new HashMap();
        hashMap.put("mr1", 1);

        for (int i = 2; i <= 12; i++) {
            hashMap.put("mr" + i, i);
        }
    }
}
