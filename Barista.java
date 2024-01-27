import java.util.Arrays;

class Barista1 implements Runnable {
    Main Array = new Main();
    String[][] myArr = Array.Myarr();

    private Box box;
    public Barista1(Box box){

        this.box = box;
    }
    public void run(){
        while(Agent.i <= 20) {
            box.get(myArr[0]);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Barista2 implements Runnable {
    Main Array = new Main();
    String[][] myArr = Array.Myarr();

    private Box box;
    public Barista2(Box box){

        this.box = box;
    }
    public void run(){
        while(Agent.i <= 20) {
            box.get(myArr[1]);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}

class Barista3 implements Runnable {
    Main Array = new Main();
    String[][] myArr = Array.Myarr();

    private Box box;
    public Barista3(Box box){

        this.box = box;
    }
    public void run(){
        while(Agent.i <= 20) {
            box.get(myArr[2]);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

