public class Demo {
    public static void main(String[] args) {
        Apple apple = new Apple(30);
        Persimmon persimmon = new Persimmon(24);
        Box<Apple> appleBox1 = new Box<>(apple, 11);
        Box<Apple> appleBox2 = new Box<>(apple, 5);
        Box<Persimmon> persimmonBox1 = new Box<>(persimmon, 8);
        Box<Persimmon> persimmonBox2 = new Box<>(persimmon, 7);
        System.out.println("Общая масса нескольких коробок: "+ (appleBox1.calculateTotalWeight()+ appleBox2.calculateTotalWeight()+ persimmonBox1.calculateTotalWeight()+ persimmonBox2.calculateTotalWeight()));
    }
}
