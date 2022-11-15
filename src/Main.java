public class Main {
    public static void main(String[] args) {
        MyVector a = new MyVector(5, 6);
        MyVector b = new MyVector(5, 10);

        System.out.printf("Длина вектора a: %d%n", a.GetVectorLength());
        System.out.printf("Длина вектора b: %d%n", b.GetVectorLength());
        System.out.print("Сумма векторов a и b: ");
        MyVector.AddVectors(a, b).PrintVector();
        System.out.print("Разность векторов a и b: ");
        MyVector.SubtractVectors(a, b).PrintVector();
        System.out.printf("Скалярное произведение векторов a и b: %d%n", MyVector.ScalarMultiplication(a, b));
        System.out.print("Произведение вектора a на число k: ");
        a.MultiplyByNumber(2).PrintVector();
        System.out.print("Частное от деления вектора b на число k: ");
        b.SubstractByNumber(-5).PrintVector();
    }
}