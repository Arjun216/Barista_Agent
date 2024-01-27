import java.util.Arrays;

public class Box {
    private Object contents = null;
    public volatile String[] myNumEq;

    private boolean empty = true;

    public synchronized void put(Object obj, String[] myNumEq) {
        // Wait for the Box to be empty
        while (!empty) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        // This Box is empty, so store obj and set myNumE
        System.out.println(Thread.currentThread().getName() + " put on table " + Arrays.toString(myNumEq));

        contents = obj;
        this.myNumEq = myNumEq;
        empty = false; // Mark the box as full.
        notifyAll();
    }

    public synchronized void get(String[] Arr) {

        if (Arrays.equals(Arr, myNumEq)) {
            // Wait for the Box to be full (not empty)
            while (empty) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }


            // Mark the box as empty.
            System.out.println(Thread.currentThread().getName() + " Coffee up number " + contents);
            empty = true;
            notifyAll();


        }
    }
}