class Box <Type extends Fruit>{
    private Type fruit;
    private int number;

    public Box(Type fruit, int number){
        this.fruit = fruit;
        this.number = number;
    }
    public int calculateTotalWeight(){
        return fruit.weight * number;
    }
    public void transferFruits(Box<Type> anotherBox){
       anotherBox.number += this.number;
       this.number = 0;
    }
}
