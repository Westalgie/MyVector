import static java.lang.Math.abs;

public class MyVector {
    private int x;
    private int y;

    public MyVector(int x, int y) {
        this.x = x;
        this.y = y;
    }

    static MyVector AddVectors(MyVector a, MyVector b) {
        return new MyVector(a.x + b.x, a.y + b.y);
    }

    static MyVector SubtractVectors(MyVector a, MyVector b) {
        return new MyVector(a.x - b.x, a.y - b.y);
    }

    static int ScalarMultiplication(MyVector a, MyVector b) {
        return a.x * b.x + a.y * b.y;
    }

    public MyVector MultiplyByNumber(int k) {
        return new MyVector(this.x * k, this.y * k);
    }

    public MyVector SubstractByNumber(int k) {
        return new MyVector(this.x / k, this.y / k);
    }

    public int GetVectorLength() {
        return abs(this.x - this.y);
    }

    public void PrintVector() {
        System.out.printf("X: %d Y: %d%n", this.x, this.y);
    }
}
