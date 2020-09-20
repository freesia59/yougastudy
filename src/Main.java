import java.util.*;

/**
 * @author lyy
 * @date 2020-09-17 5:45 下午
 */
public class Main {


    public static void main(String[] args) {
        Man man = new Man();
        man.age = 1;
        man.name = "";
        man.breath();


        try {
            man.sayHello();
            int a = 20 / 0;
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("sdad");
        }

        List<String> strings = new ArrayList<>();
        strings.add("sdas");
        strings.add("sdasdasdas");

        List<String> strings1 = new LinkedList<>();
        strings1.add("sdasd");
        strings1.clear();

        Set<String> set = new HashSet<>();

        Map<String, String> cp = new HashMap<>();
        cp.put("xiaoming", "xiaohong");
        cp.put("xiaowang", "xiaozi");
        String s = cp.get("xiaoming");
        System.out.println(s);

//        dao.Person person = new dao.Person();
//        person.name = "yoga";
//        person.age = 18;
//        System.out.println(person.age);
//        person.talk();
//        person.breath();
//
//        person.setHeight(20);
//        person.setWeight(20);
//
//        person.getHeight();
//        System.out.println(person.getWeight());
//
//        System.out.println(person.sex);

    }

}
