package Advanced.day2.HashMap;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest {
    @Test
    public void mapTest() {
        Map map = new HashMap();
        map.put(1, '2');
        map.put(2, 'a');
        map.put("bbb", "ccc");
        map.put('&', 5);

        System.out.println(map.get(1));
        System.out.println(map.containsKey("bbb"));
        map.remove(2);
        System.out.println(map.get(2));

        Set keySet = map.keySet();
        for (Object object : keySet) {
            System.out.println(object);
            System.out.println(map.get(object));
        }

        Set entrySet = map.entrySet();
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
