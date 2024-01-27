import java.util.Arrays;
import java.util.Random;

class Agent implements Runnable {
    Main Array = new Main();
    String[][] myArr = Array.Myarr();

    private Box box;
    public static int i = 0;

    public Agent(Box box) {
        this.box = box;
    }
    public void run() {
        for (i = 1; i<= 20; i++) {
            Random rand = new Random();
            int rand1 = rand.nextInt(3);
            //System.out.println(Thread.currentThread().getName() + " produced " + Arrays.toString(myArr[rand1]));
            box.put(i, myArr[rand1]);
            //System.out.println(Thread.currentThread().getName() + " put on table " + Arrays.toString(myArr[rand1]));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}