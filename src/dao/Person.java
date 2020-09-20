package dao;

/**
 * @author lyy
 * @date 2020-09-17 5:49 下午
 */
public class Person implements PersonBehavior {
    public String name;
    public int age;
    private int height;
    private int weight;

    final boolean sex = true;

    static int age2 = 20;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public void talk() {
        if (age > 20) {
            String s = say();
            System.out.println(s);
        }
    }

    @Override
    public void breath() {
        System.out.println("sdasda");
    }

    private String say() {
        return "sda";
    }
}
