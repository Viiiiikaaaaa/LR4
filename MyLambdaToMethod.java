import java.util.function.BiFunction;

public class MyLambdaToMethod {

    public static double calculateRectangleArea(double length, double width) {
        return length * width;
    }

    public double calculateTriangleArea(double base, double height) {
        return 0.5 * base * height;
    }

    public static void lambdaMethod(double[] array, BiFunction<Double, Double, Double> function) {
        System.out.println(function.apply(array[0], array[1]));
    }

    public static void main(String[] args) {
        double n = 5.34;
        double m = 6.78;
        System.out.println("Площадь прямоугольника: ");
        double rectangleArea = calculateRectangleArea(n, m);
        lambdaMethod(new double[]{n,m}, (length, width) -> calculateRectangleArea(length, width));

        MyLambdaToMethod myLambdaToMethod = new MyLambdaToMethod();
        System.out.println("Площадь треугольника: ");
        double triangleArea = myLambdaToMethod.calculateTriangleArea(n, m);
        lambdaMethod(new double[]{n,m}, myLambdaToMethod::calculateTriangleArea);

        BiFunction<Double, Double, Double> maxArea = (x, y) -> x > y ? x : y;
        Double result = maxArea.apply(rectangleArea, triangleArea);
        System.out.println("Наибольшая площадь: \n" + result);
    }
}
