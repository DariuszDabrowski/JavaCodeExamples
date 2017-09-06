package FruitGeneric;


public class FruitBasket<T extends IFruit>{
    private T fruit;
    public T getFruit(){
        return fruit;
    }
    public void setFruit(T fruit){
        this.fruit = fruit;
    }
    public String getFruitName(){
        return fruit.getName();
    }
    public String getFruiColor(){
        return fruit.getColor();
    }


}
