import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class LambdaExam {
    
}

// 예제 14-1
@FunctionalInterface
interface MyFunction {
    void run();
}

class LambdaEx1 {
    static void execute(MyFunction f) {
        f.run();
    }

    static MyFunction getMyFunction() {
        MyFunction f = () -> System.out.println("f3.run()");
        return f;
    }

    public static void main(String[] args) {
        MyFunction f1 = () -> System.out.println("f1.run()");

        MyFunction f2 = new MyFunction() {
            @Override
            public void run() {
                System.out.println("f2.run()");
            }
        };

        MyFunction f3 = getMyFunction();

        f1.run();
        f2.run();
        f3.run();

        execute(f1);
        execute(()-> System.out.println("run()"));
    }
}

// 예제 14-4
class LambdaEx4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        // list.forEach(i->System.out.print(i + ","));
        // System.out.println();

        // list.removeIf(x->x%2==0 || x%3==0);
        // System.out.println(list);

        // list.replaceAll(e->e*10);
        // System.out.println(list);

        Map<String, String> map = new HashMap<>();
        map.put("1", "1");
        map.put("2", "2");
        map.put("3", "3");
        map.put("4", "4");

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("1", 1);
        map2.put("2", 2);
        map2.put("3", 3);
        map2.put("4", 4);

        map.forEach((k, v) -> System.out.print("{" + k + "," + v + "},"));
        map.forEach((k, v) -> System.out.print("{" + k + "," + v + "},"));
        System.out.println();

        map.forEach((name, i) -> System.out.println(name+"="+i));

        System.out.println();

        Function<String, Integer> f = (String s) -> Integer.parseInt(s);
        f = Integer::parseInt;

        List<String> list2 = Arrays.asList("abc", "aaa", "bbb", "ddd", "aaa");
        Collections.sort(list2, (s1, s2) -> s2.compareTo(s1));
        list2.forEach((obj) -> System.out.println(obj));

        list.forEach(i -> System.out.print(i + " "));
        list.removeIf(x -> x%2==0 || x%3==0);
        list.forEach((obj) -> System.out.println(obj));

        list.replaceAll(i -> i*10);
        list.forEach((obj) -> System.out.println(obj));

        map.forEach((k, v) -> System.out.println("k="+k+",v="+v));
    }
    // void printVar(String name, int i) {
    //     System.out.println(name+"="+i);
    // }

    
}


class ReviewLambda {
    public static void main(String[] args) {
        // 1번
        Map m = new HashMap<>();
        m.put("key", "value");
        // 2번

        // 3번

        // 4번

    }
}