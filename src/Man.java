import dao.Person;
import dao.PersonBehavior;

/**
 * @author lyy
 * @date 2020-09-17 5:44 下午
 */
public class Man extends Person implements PersonBehavior {

    public static void main(String[] args) {

    }

    @Override
    public void talk() {
        super.talk();
    }

    void sayHello() throws Exception {
        int a = 20;
        int b = 10;
        if (a / b != 2) {
            throw new Exception();
        }
    }
}
