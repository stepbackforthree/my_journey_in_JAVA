package Advanced.day2.HashMap.EmployeeTest;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class EmployeeTest {
    @Test
    public void employeeTest() {
        Map map = new HashMap();
        map.put("张三", 800);
        map.put("李四", 1500);
        map.put("王五", 3000);

        map.replace("张三", 2600);
        System.out.println(map.get("张三"));

        Set keySet = map.keySet();
        for (Object object : keySet) {
            map.put(object, (int) map.get(object) + 100);
        }

        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

    }
}
