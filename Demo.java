public class Demo {
    public static double calculateTotalWeight(Box<?>... boxes){
        double totalWeight = 0;
        for (Box<?> box:boxes){
            totalWeight += box.calculateTotalWeight();
        }
        return totalWeight;
    }
    public static void main(String[] args) {
        Apple apple = new Apple(30);
        Persimmon persimmon = new Persimmon(24);
        Box<Apple> appleBox1 = new Box<>(apple, 11);
        Box<Apple> appleBox2 = new Box<>(apple, 5);
        Box<Persimmon> persimmonBox1 = new Box<>(persimmon, 8);
        Box<Persimmon> persimmonBox2 = new Box<>(persimmon, 7);
        double totalWeight = calculateTotalWeight(appleBox1,appleBox2,persimmonBox2,persimmonBox1);
        System.out.println("Общая масса нескольких коробок: "+ totalWeight);
    }
}
