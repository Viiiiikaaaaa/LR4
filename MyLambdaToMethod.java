import java.util.function.BinaryOperator;
import java.util.function.Function;

public class MyLambdaToMethod {

    public static double calculateRectangleArea(double length, double width) {
        return length * width;
    }

    public double calculateTriangleArea(double base, double height) {
        return 0.5 * base * height;
    }

    public static void lambdaMethod(double[] array, Function<double[], Double> lambda) {
        System.out.println(lambda.apply(array));
    }

    public static void main(String[] args) {
        double n = 5.34;
        double m = 6.78;
        System.out.println("Площадь прямоугольника: ");
        double rectangleArea = calculateRectangleArea(n, m);
        lambdaMethod(new double[]{n,m}, dimensions -> calculateRectangleArea(dimensions[0], dimensions[1]));

        MyLambdaToMethod myLambdaToMethod = new MyLambdaToMethod();
        System.out.println("Площадь треугольника: ");
        double triangleArea = myLambdaToMethod.calculateTriangleArea(n, m);
        lambdaMethod(new double[]{n,m}, dimensions -> myLambdaToMethod.calculateTriangleArea(dimensions[0], dimensions[1]));

        BinaryOperator<Double> maxArea = (x,b) -> x > b ? x : b;
        Double result = maxArea.apply((double)rectangleArea, (double)triangleArea);
        System.out.println("Наибольшая площадь: \n" + result);
    }
}