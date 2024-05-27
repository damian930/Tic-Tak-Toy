package Tic_Tak_Toy;

public class Data {
    private int state = 1;

    public int getState() { return state; }

    public void Tic() {
        System.out.print("Tic-");
        this.state=2;
    }

    public void Tak() {
        System.out.print("Tak-");
        this.state=3;
    }

    public void Toy() {
        System.out.println("Toy");
        this.state=1;
    }

}
