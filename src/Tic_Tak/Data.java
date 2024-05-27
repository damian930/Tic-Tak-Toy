package Tic_Tak;

public class Data {
    private int state = 1;

    public int getState() { return state; }

    public void Tic() {
        System.out.print("Tic-");
        this.state = 2;
    }

    public void Tak() {
        System.out.println("Tak");
        this.state = 1;
    }
}
