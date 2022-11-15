public class Main {
    public static void main(String[] args) {
        MyVector a = new MyVector(5, 6, 8);
        MyVector b = new MyVector(5, 10, 15);

        System.out.print("Длина вектора a: ");
        System.out.println(a.GetVectorLength());

        a.AddVector(b).PrintVector();

        a.SubtractVector(b).SubtractVector(b).PrintVector();

        System.out.print("Скалярное произведение векторов a и b: ");
        System.out.println(MyVector.ScalarMultiplication(a, b));

        b.MultiplyByNumber(2).PrintVector();
        b.DivideByNumber(5).PrintVector();
    }
}