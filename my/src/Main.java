import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {

    public static void main(String[] args) {
        final Date date = new Date();
        final long time = date.getTime();
        System.out.println(time);
        List<Map> list = new CopyOnWriteArrayList<>();
        Map<Object, Object> map = new LinkedHashMap<>();
        map.put(1, 1);
        map.put(2, 2);
        map.put(3, 3);
        map.put(4, 4);
        map.put(5, 5);
        map.put(6, 6);
        map.put(7, 7);
        list.add(map);
        list.forEach(System.out::println);
    }
}
