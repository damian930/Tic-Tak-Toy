package Tic_Tak;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Data d = new Data();    // state = 1

        Worker w1 = new Worker(d);
        Worker w2 = new Worker(d);

        w1.join();
        w2.join();

        System.out.println("end of main...");
    }
}
