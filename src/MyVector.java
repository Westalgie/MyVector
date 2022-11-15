import static java.lang.Math.sqrt;

public class MyVector {
    private int[] coordinates;

    public MyVector(int ... coordinates) {
        this.coordinates = coordinates;
    }

    public MyVector AddVector(MyVector vector) {
        for(int i = 0; i < this.coordinates.length; i++) {
            this.coordinates[i] = this.coordinates[i] + vector.coordinates[i];
        }
        return this;
    }

    public MyVector SubtractVector(MyVector vector) {
        for(int i = 0; i < this.coordinates.length; i++) {
            this.coordinates[i] = this.coordinates[i] - vector.coordinates[i];
        }
        return this;
    }

    static int ScalarMultiplication(MyVector a, MyVector b) {
        int result = 0;
        for(int i = 0; i < a.coordinates.length; i++) {
            result += a.coordinates[i] * b.coordinates[i];
        }
        return result;
    }

    public MyVector MultiplyByNumber(int k) {
        for(int i = 0; i < this.coordinates.length; i++) {
            this.coordinates[i] = this.coordinates[i] * k;
        }
        return this;
    }

    public MyVector DivideByNumber(int k) {
        for(int i = 0; i < this.coordinates.length; i++) {
            this.coordinates[i] = this.coordinates[i] / k;
        }
        return this;
    }

    public double GetVectorLength() {
        int result = 0;
        for(int i = 0; i < this.coordinates.length; i++) {
            result += (this.coordinates[i])^2;
        }
        return sqrt(result);
    }

    public void PrintVector() {
        System.out.print("Координаты вектора: ");
        for(int i = 0; i < this.coordinates.length; i++) {
            System.out.printf("%d ", this.coordinates[i]);
        }
        System.out.println();
    }
}
