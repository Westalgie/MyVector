import static java.lang.Math.sqrt;

public class MyVector {
    private final int[] coordinates;

    public MyVector(int ... coordinates) {
        this.coordinates = coordinates;
    }

    public MyVector AddVector(MyVector vector) {
        try {
            for (int i = 0; i < this.coordinates.length; i++) {
                this.coordinates[i] = this.coordinates[i] + vector.coordinates[i];
            }
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        return this;
    }

    public MyVector SubtractVector(MyVector vector) {
        try {
            for (int i = 0; i < this.coordinates.length; i++) {
                this.coordinates[i] = this.coordinates[i] - vector.coordinates[i];
            }
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        return this;
    }

    static int ScalarMultiplication(MyVector a, MyVector b) {
        int result = 0;
        try {
            for (int i = 0; i < a.coordinates.length; i++) {
                result += a.coordinates[i] * b.coordinates[i];
            }
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
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
        for (int coordinate : this.coordinates) {
            result += coordinate ^ 2;
        }
        return sqrt(result);
    }

    public void PrintVector() {
        System.out.print("Координаты вектора: ");
        for (int coordinate : this.coordinates) {
            System.out.printf("%d ", coordinate);
        }
        System.out.println();
    }
}
