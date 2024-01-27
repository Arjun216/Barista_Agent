import java.util.Arrays;
import java.util.Random;
public class Main {
    private String[][] myNum = {{"Coffee", "Milk"}, {"Milk","Sugar"}, {"Sugar","Coffee"}};
    public String[][] Myarr() {
        return myNum.clone();

    }

    public static void main(String[] args) {

        Box box;
        box = new Box();
        Thread agent, barista1, barista2, barista3;
        agent = new Thread(new Agent(box), "agent");
        barista1 = new Thread(new Barista1(box), "barista1");
        barista2 = new Thread(new Barista2(box), "barista2");
        barista3 = new Thread(new Barista3(box), "barista3");

        agent.start();
        barista1.start();
        barista2.start();
        barista3.start();

    }
}

